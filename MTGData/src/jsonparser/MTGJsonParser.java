/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonparser;

import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Zac Murdaugh 12/4/2018
 */
public class MTGJsonParser
{
    String file = "/Users/Zac Murdaugh/Documents/NetBeansProjects/MTGData/src/assets/AllSets.json/";
    
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
    
    String[] outputFiles = {
        "/Users/Zac Murdaugh/Documents/CREATURES.json",
        "/Users/Zac Murdaugh/Documents/INSTANTS.json",
        "/Users/Zac Murdaugh/Documents/SORCERIES.json",
        "/Users/Zac Murdaugh/Documents/ENCHANTMENTS.json",
        "/Users/Zac Murdaugh/Documents/ARTIFACTS.json",
        "/Users/Zac Murdaugh/Documents/LANDS.json",
    };
    JSONObject allData     = new JSONObject();
    
    JSONArray creatures    = new JSONArray();
    JSONArray instants     = new JSONArray();
    JSONArray sorceries    = new JSONArray();
    JSONArray lands        = new JSONArray();
    JSONArray enchantments = new JSONArray();
    JSONArray artifacts    = new JSONArray();
    
    FileReader fileReader;
    
    JSONObject jsonObject;
    JSONObject currentSetJson;
    JSONParser jsonParser;
    JSONArray  jsonArray;
    
    int TotalCounter = 0;
    int currentSet = 0;
    
    MTGJsonParser()
    {
        jsonObject = new JSONObject();
        jsonParser = new JSONParser();
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
            System.out.println("\n" + sets[i]/* + ": "*/);
            currentSetJson = (JSONObject) jsonObject.get(sets[i]);
            parseCreatures();
            parseArtifacts();
            parseInstants();
            parseEnchantments();
            parseLands();
            parseSorceries();
            
            System.out.println("Total: " + TotalCounter);
            TotalCounter = 0;
        }
        
        parseAllCreatureTypes();
        fillAllData();
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
                enchantments.add(keyValuePair);
            }
        }
        
        TotalCounter += enchantmentCounter;
        //System.out.println("\tEnchantments: " + enchantmentCounter);
        //allData.put("enchantments", enchantments);
        //System.out.println(enchantments.toString());
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
            fileWriter = new FileWriter("/Users/Zac Murdaugh/Documents/" + creatureTypes[index]+".json");
            
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
}
