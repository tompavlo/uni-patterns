import behavioral.chain_of_responsibility.*
import behavioral.command.BuyMenu
import behavioral.command.BuyWeaponCommand
import behavioral.command.Player
import behavioral.execute_around.ScriptLoader
import behavioral.iterator.*
import behavioral.memento.DemoPlayback
import behavioral.memento.PlayerState
import behavioral.memento.PlayerStateMemento
import behavioral.observer.MoneyBonusCalc
import behavioral.observer.RoundEngine
import behavioral.observer.UiRoundBox
import behavioral.strategy.CasualGameMode
import behavioral.strategy.CompetitiveGameMode
import behavioral.strategy.GameEngine
import behavioral.visitor.AWP
import behavioral.visitor.KillRewardCounterForCompetitiveGameMode
import behavioral.visitor.Pistol
import creational.abstractFactory.CTSideFactory
import creational.abstractFactory.TSideFactory
import creational.default_factory_method.CTPlayer
import creational.fabricMethod.M4a4Factory
import creational.fabricMethod.Shop
import creational.singleton.DbConnection
import kotlinx.coroutines.runBlocking
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

    val playerInventory =
        creational.builder.PlayerInventory.PlayerInventoryBuilder().money(1200).totalGrenades(1).build()
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


    val player = Player(5000)
    val buyWeaponCommandM4 = BuyWeaponCommand(player, 2800, "M4")
    val buyAWPCommand = BuyWeaponCommand(player, 4700, "AWP")

    val buyMenu = BuyMenu()

    buyMenu.registerWeapon("M4", buyWeaponCommandM4)
    buyMenu.registerWeapon("AWP", buyAWPCommand)
    buyMenu.buyWeapon("M4")
    println(player.inventory.last())
    buyMenu.returnButton()
    println(player.inventory.isEmpty())

    val inventory = HoldingInventory(TestClass(), TestClass(), TestClass())
    val iterator = inventory.getIterator()
    while (!iterator.isDone()) {
        println(iterator.current().toString())
        iterator.next()

    }

    val graffitInventory = GraffitInventory(Graffiti(), Graffiti(), Graffiti())
    for (grafitti in graffitInventory) {
        println(grafitti.toString())
    }

    val roundEngine = RoundEngine()
    val uiRoundBox = UiRoundBox(roundEngine)
    val moneyBonusCalc = MoneyBonusCalc(roundEngine)
    roundEngine.add(uiRoundBox)
    roundEngine.add(moneyBonusCalc)

    runBlocking {
        roundEngine.work()
    }

    val casualGameMode = CasualGameMode()
    val game = GameEngine(casualGameMode)
    game.changeGameMode(CompetitiveGameMode())
    game.startGame()

    val bombDefusedEvent = BombDefusedEvent()
    val bombPlantedEvent = BombPlantedEvent()
    val connectionTimeoutEvent = ConnectionTimeoutEvent()
    val teamTimeoutEvent = TeamTimeoutEvent()

    bombDefusedEvent.setNextGameEventHandler(bombPlantedEvent)
    bombPlantedEvent.setNextGameEventHandler(connectionTimeoutEvent)
    connectionTimeoutEvent.setNextGameEventHandler(teamTimeoutEvent)

    bombDefusedEvent.handleEvent(GameEvents.TEAM_TIMEOUT)

    val awpVisitor = AWP("AWP")
    val pistolVisitor = Pistol("USP-S")
    val visitor = KillRewardCounterForCompetitiveGameMode()

    println("Kill reward for awp " + awpVisitor.accept(visitor))
    println("Kill reward for pistol " + pistolVisitor.accept(visitor))

    val playerMementoPattern = PlayerState(100, 4000, 12, 12, 12)
    val demoPlayback = DemoPlayback()
    demoPlayback.addTick(playerMementoPattern.saveState())
    playerMementoPattern.health = 12
    playerMementoPattern.money = 2000
    playerMementoPattern.x = 10
    playerMementoPattern.z = 10
    playerMementoPattern.y = 10
    println(playerMementoPattern)
    playerMementoPattern.restoreState(demoPlayback.getMemento(0)?: PlayerStateMemento(0, 0, 0, 0, 0))
    println(playerMementoPattern.toString())

    println("That all the patterns!")

    println("Now let's look at the revisited patterns")

    val gun = creational.default_factory_method.M4()
    val ctPlayer = CTPlayer(gun)
    ctPlayer.makeDamage()

    val scriptLoader = ScriptLoader.use { println("Test") }
}