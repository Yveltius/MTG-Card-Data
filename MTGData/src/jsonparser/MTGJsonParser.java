/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonparser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Zac Murdaugh 12/4/2018
 */
public class MTGJsonParser
{
    String file = "./src/assets/AllSets.json/";
    
    //<editor-fold defaultstate="collapsed" desc="Creature Types">
    String[] creatureTypes = {
        "Advisor",
        "Aetherborn",
        "Ally",
        "Angel",
        "Antelope",
        "Ape",
        "Archer",
        "Archon",
        "Artificer",
        "Assassin",
        "Assembly-Worker",
        "Atog",
        "Aurochs",
        "Avatar",
        "Azra",
        "Badger",
        "Barbarian",
        "Basilisk",
        "Bat",
        "Bear",
        "Beast",
        "Beeble",
        "Berserker",
        "Bird",
        "Blinkmoth",
        "Boar",
        "Bringer",
        "Brushwagg",
        "Camarid",
        "Camel",
        "Caribou",
        "Carrier",
        "Cat",
        "Centaur",
        "Cephalid",
        "Chimera",
        "Citizen",
        "Cleric",
        "Cockatrice",
        "Construct",
        "Coward",
        "Crab",
        "Crocodile",
        "Cyclops",
        "Dauthi",
        "Demon",
        "Deserter",
        "Devil",
        "Dinosaur",
        "Djinn",
        "Dragon",
        "Drake",
        "Dreadnought",
        "Drone",
        "Druid",
        "Dryad",
        "Dwarf",
        "Efreet",
        "Egg",
        "Elder",
        "Eldrazi",
        "Elemental",
        "Elephant",
        "Elf",
        "Elk",
        "Eye",
        "Faerie",
        "Ferret",
        "Fish",
        "Flagbearer",
        "Fox",
        "Frog",
        "Fungus",
        "Gargoyle",
        "Germ",
        "Giant",
        "Gnome",
        "Goat",
        "Goblin",
        "God",
        "Golem",
        "Gorgon",
        "Graveborn",
        "Gremlin",
        "Griffin",
        "Hag",
        "Harpy",
        "Hellion",
        "Hippo",
        "Hippogriff",
        "Homarid",
        "Homunculus",
        "Horror",
        "Horse",
        "Hound",
        "Human",
        "Hydra",
        "Hyena",
        "Illusion",
        "Imp",
        "Incarnation",
        "Insect",
        "Jackal",
        "Jellyfish",
        "Juggernaut",
        "Kavu",
        "Kirin",
        "Kithkin",
        "Knight",
        "Kobold",
        "Kor",
        "Kraken",
        "Lamia",
        "Lammasu",
        "Leech",
        "Leviathan",
        "Lhurgoyf",
        "Licid",
        "Lizard",
        "Manticore",
        "Masticore",
        "Mercenary",
        "Merfolk",
        "Metathran",
        "Minion",
        "Minotaur",
        "Mole",
        "Monger",
        "Mongoose",
        "Monk",
        "Monkey",
        "Moonfolk",
        "Mutant",
        "Myr",
        "Mystic",
        "Naga",
        "Nautilus",
        "Nephilim",
        "Nightmare",
        "Nightstalker",
        "Ninja",
        "Noggle",
        "Nomad",
        "Nymph",
        "Octopus",
        "Ogre",
        "Ooze",
        "Orb",
        "Orc",
        "Orgg",
        "Ouphe",
        "Ox",
        "Oyster",
        "Pangolin",
        "Pegasus",
        "Pentavite",
        "Pest",
        "Phelddagrif",
        "Phoenix",
        "Pilot",
        "Pincher",
        "Pirate",
        "Plant",
        "Praetor",
        "Prism",
        "Processor",
        "Rabbit",
        "Rat",
        "Rebel",
        "Reflection",
        "Rhino",
        "Rigger",
        "Rogue",
        "Sable",
        "Salamander",
        "Samurai",
        "Sand",
        "Saproling",
        "Satyr",
        "Scarecrow",
        "Scion",
        "Scorpion",
        "Scout",
        "Serf",
        "Serpent",
        "Servo",
        "Shade",
        "Shaman",
        "Shapeshifter",
        "Sheep",
        "Siren",
        "Skeleton",
        "Slith",
        "Sliver",
        "Slug",
        "Snake",
        "Soldier",
        "Soltari",
        "Spawn",
        "Specter",
        "Spellshaper",
        "Sphinx",
        "Spider",
        "Spike",
        "Spirit",
        "Splinter",
        "Sponge",
        "Squid",
        "Squirrel",
        "Starfish",
        "Surrakar",
        "Survivor",
        "Tetravite",
        "Thalakos",
        "Thopter",
        "Thrull",
        "Treefolk",
        "Trilobite",
        "Triskelavite",
        "Troll",
        "Turtle",
        "Unicorn",
        "Vampire",
        "Vedalken",
        "Viashino",
        "Volver",
        "Wall",
        "Warrior",
        "Weird",
        "Werewolf",
        "Whale",
        "Wizard",
        "Wolf",
        "Wolverine",
        "Wombat",
        "Worm",
        "Wraith",
        "Wurm",
        "Yeti",
        "Zombie",
        "Zubera"
    };
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Artifact Types">
    String[] artifactTypes = {
        "Creature",
        "Equipment",
        "Contraption",
        "Fortification",
        "Clue"
    };
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Enchantment Types">
    String[] enchantmentTypes = {
        "Aura",
        "Curse",
        "Shrine"
    };
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Instant Types">
    String[] instantTypes = {
        "Arcane",
        "Trap"
    };
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Sorcery Types">
    String[] sorceryTypes = {
        "Arcane"
    };
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Land Types">
    String[] landTypes = {
        "Plains",
        "Island",
        "Swamp",
        "Mountain",
        "Forest",
        "Desert",
        "Gate",
        "Lair",
        "Locus",
        "Mine",
        "Power-Plant",
        "Tower",
        "Urza's",
    };
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Sets">
    String[] sets = {
        "10E",
        "LEA",
        "LEB",
        "2ED",
        "3ED",
        "4ED",
        "5ED",
        "6ED",
        "7ED",
        "8ED",
        "9ED",
        "10E",
        "M10",
        "M11",
        "M12",
        "M13",
        "M14",
        "M15",
        "ORI",
        "M19"
    };
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Output Files">
    String[] outputFiles = {
        "./src/assets/CreatedJson/CREATURES.json",
        "./src/assets/CreatedJson/INSTANTS.json",
        "./src/assets/CreatedJson/SORCERIES.json",
        "./src/assets/CreatedJson/ENCHANTMENTS.json",
        "./src/assets/CreatedJson/ARTIFACTS.json",
        "./src/assets/CreatedJson/LANDS.json",
        "./src/assets/CreatedJson/PLANESWALKERS.json"
    };
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Global Variables">
    JSONObject allData      = new JSONObject();
    
    JSONArray creatures     = new JSONArray();
    JSONArray instants      = new JSONArray();
    JSONArray sorceries     = new JSONArray();
    JSONArray lands         = new JSONArray();
    JSONArray enchantments  = new JSONArray();
    JSONArray artifacts     = new JSONArray();
    JSONArray planeswalkers = new JSONArray();
    
    FileReader fileReader;
    
    JSONObject jsonObject;
    JSONObject currentSetJson;
    JSONParser jsonParser;
    JSONArray  jsonArray;
    
    int TotalCounter = 0;
    int currentSet = 0;
//</editor-fold>
    
    MTGJsonParser()
    {
        jsonObject = new JSONObject();
        jsonParser = new JSONParser();
    }
    
    public void parseMTGsets()
    {
	   JSONObject json = null;
	   try
	   {
		  fileReader = new FileReader(file);
		  json = (JSONObject) jsonParser.parse(fileReader);
	   }
	   catch(Exception e)
	   {
		  e.printStackTrace();
		  System.exit(1);
	   }
	   Set<JSONObject> topset = json.keySet();
	   ArrayList<String> list = new ArrayList<String>();
	  
	   sets = topset.toString().split(",|\\[|\\]");
	    for (String s : sets)
	   {
		  list.add(s);
	   }
	    //sets = (String[])
	    list.toArray(sets);
//	   for (int i = 0; i < sets.length ;i++)
//	   {
//		  sets[i] = sets[i].split("[")[0];
//		  System.out.println(sets[i]);
//		  sets[i] = sets[i].split("]")[0];
//	   }
    }
    public void parseMTGJson()
    {
        try{
            fileReader = new FileReader(file);
            jsonObject = (JSONObject) jsonParser.parse(fileReader);
        }catch(Exception e){
            e.printStackTrace();
        }
            
        for(int i = 0; i < sets.length; i++)
        {
            currentSet = i;
		  if (sets[i].isEmpty())
		  {
			 continue;
		  }
            System.out.println("\n" + sets[i]/*+ ": "*/);
            currentSetJson = (JSONObject) jsonObject.get(sets[i]);
		  if (currentSetJson == null)
		  {
			 continue;
		  }
            
            parseCreatures();
            parseArtifacts();
            parseInstants();
            parseEnchantments();
            parseLands();
            parseSorceries();
            parsePlaneswalkers();
            
            System.out.println("Total: " + TotalCounter);
            TotalCounter = 0;
        }
        
        parseAllCreatureTypes();
        parseAllArtifactTypes();
        parseAllEnchantmentTypes();
        //parseAllInstantTypes();
        //parseAllSorceryTypes();
        //parseAllLandTypes();
//        fillAllData();
    }
    
    private void parseCreatures()
    {
        int creatureCounter = 0;
        jsonArray = (JSONArray) currentSetJson.get("cards");
        
        for(int i = 0; i < jsonArray.size(); i++)
        {
            JSONObject card = (JSONObject) jsonArray.get(i);

            String type = (String) card.get("type");
            String name = (String) card.get("name");
            
            if(type.contains("Creature"))
            {
                creatureCounter++;
                JSONObject keyValuePair = new JSONObject();
                keyValuePair.put("name", name);
                keyValuePair.put("set", currentSet);
                keyValuePair.put("type", type);
                creatures.add(keyValuePair);
            }
        }
        
        TotalCounter += creatureCounter;
        //System.out.println("\tCreatures: " + creatureCounter);
        //allData.put("creatures", creatures);
        //System.out.println(creatures.toString());
    }
    
    private void parseInstants()
    {
        int instantCounter = 0;
        jsonArray = (JSONArray) currentSetJson.get("cards");
        
        for(int i = 0; i < jsonArray.size(); i++)
        {
            JSONObject card = (JSONObject) jsonArray.get(i);

            String type = (String) card.get("type");
            String name = (String) card.get("name");
            
            if(type.contains("Instant"))
            {
                instantCounter++;
                JSONObject keyValuePair = new JSONObject();
                keyValuePair.put("name", name);
                keyValuePair.put("set", currentSet);
                keyValuePair.put("type", type);
                instants.add(keyValuePair);
            }
        }
        
        TotalCounter += instantCounter;
        //System.out.println("\tInstants: " + instantCounter);
        //allData.put("instants", instants);
        //System.out.println(instants.toString());
    }
    
    private void parseSorceries()
    {
        int sorceryCounter = 0;
        jsonArray = (JSONArray) currentSetJson.get("cards");
        
        for(int i = 0; i < jsonArray.size(); i++)
        {
            JSONObject card = (JSONObject) jsonArray.get(i);

            String type = (String) card.get("type");
            String name = (String) card.get("name");
            
            if(type.contains("Sorcery"))
            {
                sorceryCounter++;
                JSONObject keyValuePair = new JSONObject();
                keyValuePair.put("name", name);
                keyValuePair.put("set", currentSet);
                keyValuePair.put("type", type);
                sorceries.add(keyValuePair);
            }
        }
        
        TotalCounter += sorceryCounter;
        //System.out.println("\tSorceries: " + sorceryCounter);
        //allData.put("sorceries", sorceries);
        //System.out.println(sorceries.toString());
    }
    
    private void parseArtifacts()
    {
        int artifactCounter = 0;
        jsonArray = (JSONArray) currentSetJson.get("cards");
        
        for(int i = 0; i < jsonArray.size(); i++)
        {
            JSONObject card = (JSONObject) jsonArray.get(i);

            String type = (String) card.get("type");
            String name = (String) card.get("name");
            
            if(type.contains("Artifact"))
            {
                artifactCounter++;
                JSONObject keyValuePair = new JSONObject();
                keyValuePair.put("name", name);
                keyValuePair.put("set", currentSet);
                keyValuePair.put("type", type);
                artifacts.add(keyValuePair);
            }
        }
        
        TotalCounter += artifactCounter;
        //System.out.println("\tArtifacts: " + artifactCounter);
        //allData.put("artifacts", artifacts);
        //System.out.println(artifacts.toString());
    }
    
    private void parseLands()
    {
        int landCounter = 0;
        jsonArray = (JSONArray) currentSetJson.get("cards");
        
        for(int i = 0; i < jsonArray.size(); i++)
        {
            JSONObject card = (JSONObject) jsonArray.get(i);

            String type = (String) card.get("type");
            String name = (String) card.get("name");
            
            if(type.contains("Land"))
            {
                landCounter++;
                JSONObject keyValuePair = new JSONObject();
                keyValuePair.put("name", name);
                keyValuePair.put("set", currentSet);
                keyValuePair.put("type", type);
                lands.add(keyValuePair);
            }
        }
        
        TotalCounter += landCounter;
        //System.out.println("\tLands: " + landCounter);
        //allData.put("lands", lands);
        //System.out.println(lands.toString());
    }
    
    private void parseEnchantments()
    {
        int enchantmentCounter = 0;
        jsonArray = (JSONArray) currentSetJson.get("cards");
        
        for(int i = 0; i < jsonArray.size(); i++)
        {
            JSONObject card = (JSONObject) jsonArray.get(i);

            String type = (String) card.get("type");
            String name = (String) card.get("name");
            
            if(type.contains("Enchantment"))
            {
                enchantmentCounter++;
                JSONObject keyValuePair = new JSONObject();
                keyValuePair.put("name", name);
                keyValuePair.put("set", currentSet);
                keyValuePair.put("type", type);
                enchantments.add(keyValuePair);
            }
        }
        
        TotalCounter += enchantmentCounter;
        //System.out.println("\tEnchantments: " + enchantmentCounter);
        //allData.put("enchantments", enchantments);
        //System.out.println(enchantments.toString());
    }
    
    private void parsePlaneswalkers()
    {
        int planeswalkerCounter = 0;
        jsonArray = (JSONArray) currentSetJson.get("cards");
        
        for(int i = 0; i < jsonArray.size(); i++)
        {
            JSONObject card = (JSONObject) jsonArray.get(i);

            String type = (String) card.get("type");
            String name = (String) card.get("name");
            
            if(type.contains("Planeswalker"))
            {
                planeswalkerCounter++;
                JSONObject keyValuePair = new JSONObject();
                keyValuePair.put("name", name);
                keyValuePair.put("set", currentSet);
                keyValuePair.put("type", type);
                planeswalkers.add(keyValuePair);
            }
        }
        
        TotalCounter += planeswalkerCounter;
        //System.out.println("\Planeswalkers: " + planeswalkerCounter);
        //allData.put("planeswalkers", planeswalkers);
        //System.out.println(planeswalkers.toString());
    }
    
    private void fillAllData()
    {
        allData.put("creatures", creatures);
        allData.put("artifacts", artifacts);
        allData.put("lands", lands);
        allData.put("sorceries", sorceries);
        allData.put("instants", instants);
        allData.put("enchantments", enchantments);
    }
    
    public void exportMTGJsonToFile()
    {
        FileWriter fileWriter;
        
        try{
            for(int i = 0; i < outputFiles.length; i++)
            {
                fileWriter = new FileWriter(outputFiles[i]);
                
                switch(i)
                {
                    case 0:
                        fileWriter.write(creatures.toJSONString());
                        fileWriter.flush();
                        fileWriter.close();
                        break;
                        
                    case 1:
                        fileWriter.write(instants.toJSONString());
                        fileWriter.flush();
                        fileWriter.close();
                        break;
                        
                    case 2:
                        fileWriter.write(sorceries.toJSONString());
                        fileWriter.flush();
                        fileWriter.close();
                        break;
                        
                    case 3:
                        fileWriter.write(enchantments.toJSONString());
                        fileWriter.flush();
                        fileWriter.close();
                        break;
                        
                    case 4:
                        fileWriter.write(artifacts.toJSONString());
                        fileWriter.flush();
                        fileWriter.close();
                        break;
                        
                    case 5:
                        fileWriter.write(lands.toJSONString());
                        fileWriter.flush();
                        fileWriter.close();
                        break;
                        
                    case 6:
                        fileWriter.write(planeswalkers.toJSONString());
                        fileWriter.flush();
                        fileWriter.close();
                        break;
                        
                    default:
                        break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void exportCreatureTypeToJsonFile(JSONArray array, int index)
    {
        FileWriter fileWriter;
        
        try{
            fileWriter = new FileWriter("./src/assets/CreatedJson/" + creatureTypes[index]+".json", true);
            
            fileWriter.write(array.toJSONString());
            fileWriter.flush();
            fileWriter.close();
        }
//	   catch(IOException ioe)
//	   {
//		  System.out.println("file specified is directory, ex msg.: " + ioe.getMessage());
//	   }
	   catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void exportArtifactTypeToJsonFile(JSONArray array, int index)
    {
        FileWriter fileWriter;
        
        try{
            fileWriter = new FileWriter("./src/assets/CreatedJson/Artifact" + artifactTypes[index]+".json");
            
            fileWriter.write(array.toJSONString());
            fileWriter.flush();
            fileWriter.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void exportEnchantmentTypeToJsonFile(JSONArray array, int index)
    {
        FileWriter fileWriter;
        
        try{
            fileWriter = new FileWriter("./src/assets/CreatedJson/" + enchantmentTypes[index]+".json");
            
            fileWriter.write(array.toJSONString());
            fileWriter.flush();
            fileWriter.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    void readInJson(String file)
    {
        try{
            fileReader = new FileReader(file);
            
            jsonObject = (JSONObject) jsonParser.parse(fileReader);
            
            System.out.println(jsonObject);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void parseAllCreatureTypes()
    {
        JSONArray tempArray = new JSONArray();
        JSONObject current  = new JSONObject();
        String type;
        String name;
        
        for(int i = 0; i < creatureTypes.length; i++)
        {
            System.out.println("\n" + creatureTypes[i]);
            for(int j = 0; j < creatures.size(); j++)
            {
                current = (JSONObject) creatures.get(j);
                type = (String) current.get("type");
                
                if(type.contains(creatureTypes[i]))
                {
                    tempArray.add(current);
                }
            }
            exportCreatureTypeToJsonFile(tempArray, i);
            tempArray = new JSONArray();
        }
    }
    
    public void parseAllArtifactTypes()
    {
        JSONArray tempArray = new JSONArray();
        JSONObject current  = new JSONObject();
        String type;
        String name;
        
        for(int i = 0; i < artifactTypes.length; i++)
        {
            System.out.println("\n" + artifactTypes[i]);
            for(int j = 0; j < artifacts.size(); j++)
            {
                current = (JSONObject) artifacts.get(j);
                type = (String) current.get("type");
                
                if(type.contains(artifactTypes[i]))
                {
                    tempArray.add(current);
                }
            }
            exportArtifactTypeToJsonFile(tempArray, i);
            tempArray = new JSONArray();
        }
    }
    
    public void parseAllEnchantmentTypes()
    {
        JSONArray tempArray = new JSONArray();
        JSONObject current  = new JSONObject();
        String type;
        String name;
        
        for(int i = 0; i < enchantmentTypes.length; i++)
        {
            System.out.println("\n" + enchantmentTypes[i]);
            for(int j = 0; j < enchantments.size(); j++)
            {
                current = (JSONObject) enchantments.get(j);
                type = (String) current.get("type");
                
                if(type.contains(enchantmentTypes[i]))
                {
                    tempArray.add(current);
                }
            }
            exportEnchantmentTypeToJsonFile(tempArray, i);
            tempArray = new JSONArray();
        }
    }
}
