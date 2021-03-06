package com.endermanapm.minucia;

/**
 * Created by Ender on 30/01/2017.
 */
public class Reference {
    public static final String modId = "enderminucia";
    public static final String name = "Minucia";
    public static final String version = "0.0.1";
    public static final String accepted_versions = "[1.10.2]";

    public static final String client_proxy_class = "com.endermanapm.minucia.proxy.ClientProxy";
    public static final String server_proxy_class = "com.endermanapm.minucia.proxy.ServerProxy";

    public static enum TutorialItems
    {
        CHEESE("cheese", "ItemCheese");

        private String unlocalizedName;
        private String registryName;

        TutorialItems(String unlocalizedName, String registryName)
        {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName()
        {
            return unlocalizedName;
        }

        public String getRegistryName()
        {
            return registryName;
        }
    }
}
