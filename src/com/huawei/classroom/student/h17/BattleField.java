package com.huawei.classroom.student.h17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author super
 */
public class BattleField {
    private static List<Player> players = new ArrayList<>();// new!!
//    private static final int MAX_NULL_COUNT = 10;

    public BattleField() {
        players = null;
    }

    public static void init(String filename) {
        List<String[]> rule = readLines(filename);
        if (rule == null) {
            return;
        }
        for (String[] ruleEle : rule) {
            setValue(ruleEle);
        }
    }

    public static void createPlayer(String playerName) {
        if (playerName == null) {
            return;
        }
        Player newPlayer = new Player(playerName);
        players.add(newPlayer);
    }

    public static List<Player> getAllPlayer() {
        return players;
    }

    public static GameBase createGameBase(Player player, int x, int y) {
        return new GameBase(player, x, y);
    }

    private static List<String[]> readLines(String filename) {
        String line = "";
        Reader reader = null;
        List<String[]> result = new ArrayList<>();
        try {
            reader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (reader == null) {
            return null;
        }
        LineNumberReader lineReader = new LineNumberReader(reader);

        try {
            while (true) {
                line = lineReader.readLine();
                if (line == null) {
                    break;
                }
                if (line.trim().length() == 0 || line.startsWith("#")) {// improve
                    continue;
                }
                result.add(line.trim().split("\\.|="));// \\!!
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static void setValue(String[] rule) {
        if (EnumObjectType.base.toString().equals(rule[0])) {
            if (EnumObjectType.health.toString().equals(rule[1])) {
                Param.baseHealth = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.strength.toString().equals(rule[0])) {
                Param.baseStrength = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.range.toString().equals(rule[0])) {
                Param.baseRange = Integer.parseInt(rule[2]);
            }
        } else if (EnumObjectType.heavyTank.toString().equals(rule[0])) {
            if (EnumObjectType.health.toString().equals(rule[1])) {
                Param.heavyTankHealth = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.strength.toString().equals(rule[1])) {
                Param.heavyTankStrength = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.range.toString().equals(rule[1])) {
                Param.heavyTankRange = Integer.parseInt(rule[2]);
            }
        } else if (EnumObjectType.mediumTank.toString().equals(rule[0])) {
            if (EnumObjectType.health.toString().equals(rule[1])) {
                Param.mediumTankHealth = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.strength.toString().equals(rule[1])) {
                Param.mediumTankStrength = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.range.toString().equals(rule[1])) {
                Param.mediumTankRange = Integer.parseInt(rule[2]);
            }
        } else if (EnumObjectType.rifleSoldier.toString().equals(rule[0])) {
            if (EnumObjectType.health.toString().equals(rule[1])) {
                Param.rifleSoldierHealth = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.strength.toString().equals(rule[1])) {
                Param.rifleSoldierStrength = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.range.toString().equals(rule[1])) {
                Param.rifleSoldierRange = Integer.parseInt(rule[2]);
            }
        } else if (EnumObjectType.RPGSoldier.toString().equals(rule[0])) {
            if (EnumObjectType.health.toString().equals(rule[1])) {
                Param.RPGSoldierHealth = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.strength.toString().equals(rule[1])) {
                Param.RPGSoldierStrength = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.range.toString().equals(rule[1])) {
                Param.RPGSoldierRange = Integer.parseInt(rule[2]);
            }
        } else if (EnumObjectType.dog.toString().equals(rule[0])) {
            if (EnumObjectType.health.toString().equals(rule[1])) {
                Param.dogHealth = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.strength.toString().equals(rule[1])) {
                Param.dogStrength = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.range.toString().equals(rule[1])) {
                Param.dogRange = Integer.parseInt(rule[2]);
            }
        } else if (EnumObjectType.warFactory.toString().equals(rule[0])) {
            if (EnumObjectType.health.toString().equals(rule[1])) {
                Param.warFactoryHealth = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.strength.toString().equals(rule[1])) {
                Param.warFactoryStrength = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.range.toString().equals(rule[1])) {
                Param.warFactoryRange = Integer.parseInt(rule[2]);
            }
        } else if (EnumObjectType.barrack.toString().equals(rule[0])) {
            if (EnumObjectType.health.toString().equals(rule[1])) {
                Param.barrackHealth = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.strength.toString().equals(rule[1])) {
                Param.barrackStrength = Integer.parseInt(rule[2]);
            } else if (EnumObjectType.range.toString().equals(rule[1])) {
                Param.barrackRange = Integer.parseInt(rule[2]);
            }
        }
    }
}
