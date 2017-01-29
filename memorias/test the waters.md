###Introduction
http://minecraft.gamepedia.com/Mods/Creating_mods

####Tutorials
http://www.minecraftforum.net/forums/mapping-and-modding/mapping-and-modding-tutorials/2718726-list-of-minecraft-1-10-x-modding-tutorials

#####Written
https://shadowfacts.net/tutorials/forge-modding-1102/

#####Video
https://www.youtube.com/playlist?list=PLy11IosblXIH-OIKa5yYs-KEA2LCohV8g
http://www.pahimar.com/tutorials/lets-mod/

##Setting up the Development Environment

Download Forge MDK

http://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.10.2.html

Necesary files:

	src/
	build.gradle
	gradle/
	gradlew
	gradlew.bat

Update **build.gradle**

    sourceCompatibility = "1.8" targetCompatibility = "1.8"

Build 

    gradlew setupDecompWorkspace idea
    
###Main Mod Class

./src/main/java - new package

Ver ==> https://shadowfacts.net/tutorials/forge-modding-1102/main-mod-class/

- **@Mod(...)**: This marks our TutorialMod class as a main mod class so that Forge will load it.
- @Mod.Instance(modId) (L15-L16): The @Mod.Instance annotation marks this field so that Forge will
 inject the instance of our mod that is used into it. This will become more important later when
  we’re working with GUIs.
- @Mod.EventHandler methods (L15, L20, L25): This annotation marks our preInit, init, and postInit
 methods to be called by Forge. Forge determines which method to call for which lifecycle event by checking the parameter of the method, so these methods can be named anything you want.