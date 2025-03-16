import creational.abstractFactory.CTSideFactory
import creational.abstractFactory.TSideFactory
import creational.fabricMethod.M4a4Factory
import creational.fabricMethod.Shop
import creational.singleton.DbConnection
import structual.composite.Directory
import structual.composite.File
import structual.decorator.Charm
import structual.decorator.M4
import structual.decorator.Skin
import structual.decorator.Stattrek


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

    val playerInventory = creational.builder.PlayerInventory.PlayerInventoryBuilder().money(1200).totalGrenades(1).build()
    playerInventory.showMoney()
    playerInventory.showGrenades()

    println()
    println()

    val M4 = M4()
    val skin = Skin(M4)
    val stattrek = Stattrek(skin)
    val charm = Charm(stattrek)
    charm.display()

    val file1 = File("file1")
    val file2 = File("file2")

    val directory = Directory("First directory", listOf(file2, file1))
    val directory2 = Directory("Main directory", listOf(directory, file1))

    directory2.read()
}