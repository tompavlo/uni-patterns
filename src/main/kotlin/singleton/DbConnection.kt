package singleton

import kotlinx.coroutines.*

class DbConnection private constructor() {
    companion object{
        @Volatile
        private var instance: DbConnection? = null

        fun getInstance(): DbConnection {
            if (instance==null){
                synchronized(this){
                    if(instance==null){
                        instance = DbConnection()
                    }
                }
            }
            return instance!!
        }
    }

    private lateinit var connection: String

    fun initConnection(connectionDb: String){
        if(!this::connection.isInitialized) {
            this.connection = connectionDb
        }
    }

    fun connectToDb(){
        runBlocking {
            launch {
                createNewConnection()
            }
        }
    }

    private suspend fun createNewConnection(){
        delay(2000)
        println("Connection created")
    }




}