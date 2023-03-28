
public class PlanetSafety {
    public static void main(String[] args) {
        // Параметры безопасности планеты
        boolean isNoNuclearWar = true;
        boolean isNoAlienInvasion = false;
        boolean isNoNaturalDisaster = true;
        boolean isNoGlobalPandemic = false;
        boolean isNoArtificialIntelligenceTakeover = false;
        boolean isNoClimateChange = true;
        boolean isNoAsteroidImpact = true;
        boolean isNoSupervolcanicEruption = true;
        boolean isNoZombieApocalypse = true;
        boolean isNoRobotUprising = false;

        // Определяем, является ли планета безопасной
        boolean isPlanetSafe = isNoNuclearWar && isNoAlienInvasion && isNoNaturalDisaster && !isNoGlobalPandemic && !isNoArtificialIntelligenceTakeover && isNoClimateChange && isNoAsteroidImpact && isNoSupervolcanicEruption && isNoZombieApocalypse && !isNoRobotUprising;

        // Выводим результат
        System.out.println("Is planet safe? " + isPlanetSafe);
    }
}
