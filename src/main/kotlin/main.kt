import abstractFactory.CTSide
import abstractFactory.CTSideFactory
import abstractFactory.TSideFactory
import fabricMethod.M4a4Factory
import fabricMethod.Shop
import singleton.DbConnection

fun main() {
    val connection: DbConnection = DbConnection.getInstance()

    connection.connectToDb()
    val connection2: DbConnection = DbConnection.getInstance()
    println(connection.hashCode())
    println(connection2.hashCode())

    val m4a4Factory: M4a4Factory = M4a4Factory(34, 3100)
    val shop = Shop(m4a4Factory)

    println("Your weapon: ${shop.getWeapon().name}")
    shop.getWeapon().shoot()

    println("Creating teams")
    val tSideFactory = TSideFactory()
    val ctSideFactory = CTSideFactory()
    val terrorist = tSideFactory.summonTerrorist("Danger man", true)
    val hacker = tSideFactory.summonHacker("Intel", false)
    val SWAT = ctSideFactory.summonSWAT("Elit crew member", true)
    val FBI = ctSideFactory.summonFBI("Immense intelligence", false)

    println("Team of T: ${terrorist.name} and ${hacker.name}")
    terrorist.attack()
    hacker.attack()
    println("TEAM of CT: ${SWAT.name} and ${FBI.name}")
    SWAT.attack()
    FBI.attack()


}