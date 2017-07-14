/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chooseyourownadventure;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("which way do you want to go, left or right?");
        String choice = keyboard.nextLine();
        String choice2 = "";
        String choice3 = "";
        if (choice.equals("left")) {
            System.out.println("you have entered a safe route.");
        }
        if (choice.equals("right")) {
            System.out.println("you have chosen a semi-dangerous route.");
        }
        if (choice.equals("left")) {
            System.out.println("which route do you want to take now death 1 or death 2.");
            choice2 = keyboard.nextLine();
            if (choice2.equals("death 1")) {
                System.out.println("you have trap doors and spikes in the way plus a pit of snakes and moving saws.");
            }
            if (choice2.equals("death 2")) {
                System.out.println("you have one but difficult trap and it is a 20 foot long parcore.");
            }
        }
        if (choice.equals("right")) {
            System.out.println("you have two options relax 1 or relax 2 with a skull at the top.");
            choice3 = keyboard.nextLine();
            if (choice3.equals("relax 1")) {
                System.out.println("you have fallen into a pit with two other options");
            }
            if (choice3.equals("relax 2")) {
                System.out.println("you have successfully made it to the last two paths");
            }
        }
        if (choice2.equals("death 1")) {
            System.out.println("after a long and dangerous path you have come down to the last two paths, home 1 or home 2.");
            String choice4 = keyboard.nextLine();
            if (choice4.equals("home 1")) {
                System.out.println("if this is your path you must fight a gladiator to be set free but he is a skilled bows men.");
                System.out.println("you must choose your weapon so you can escape there's no turning back now. which weapon do you choose sheild and mace or a sword");
                String choiceunknown = keyboard.nextLine();
                if (choiceunknown.equals("sheild and mace")) {
                    System.out.println("CONGRADULATIONS YOU HAVE ESCAPED THE DUNGEON");
                }
                if (choiceunknown.equals("sword")) {
                    System.out.println("you have died and now you sit in the arena bleeding to your death");
                }
            }
            if (choice4.equals("home 2")) {
                System.out.println("you have entered the room and now you are surrounded by assassins who were hired to kill you, but they give you and opition to join them which will you choose. join them or fight them");
                String choiceunknown2 = keyboard.nextLine();
                if (choiceunknown2.equals("join them")) {
                    System.out.println("since you joined them you need to always be alert at all times and only take assassin jobs. remember to follow the person that hired you and if there's a group job ask others to help you.");
                }
                if (choiceunknown2.equals("fight them")) {
                    System.out.println("you have died a painful death and cut into pieces. first with your arms, then legs, then head.");
                }
            }
        }
        String choiceunknown3 = "";
        if (choice2.equals("death 2")) {
            System.out.println("after doing a super hard parcore course you have entered the room with two other rooms, which room do you choose kill 1 or kill 2.");
            choiceunknown3 = keyboard.nextLine();
            if (choiceunknown3.equals("kill 1")) {
                System.out.println("you have entered the lava stage and now you need to get across to the other side but you dont know how. do you 'give up' or keep looking");
            }
            String choiceunknown4 = keyboard.nextLine();
            if (choiceunknown4.equals("give up")) {
                System.out.println("20 minutes later a lava of lava burns you to death.");
            }
            if (choiceunknown4.equals("keep looking")) {
                System.out.println("you have found some rubble floating in the lava and you use it to drift across to the otherside");
            }
            if (choiceunknown3.equals("kill 2")) {
                System.out.println("you have an endless pit that has pillars and you have to jump to each but you also have a narrow path on the sie of the cave. which do you choose pillars or narrow path");
            }
            String choiceunknown5 = keyboard.nextLine();
            if (choiceunknown5.equals("pillars")) {
                System.out.println("you have made it to the other side just before you slipped and fell to your death");
                System.out.println("now two paths form infront of you which do you choose left 3 or right 3");
                
                }
                if (choiceunknown5.equals("right 3")) {
                    System.out.println("you will now find a feast and is all free to eat.");
                    System.out.println("which do you choose, eat or dont eat");
                }
                String choiceunknown10 = keyboard.nextLine();
            if (choiceunknown10.equals("eat")){
                System.out.println("you die of food poisioning");
            }
            if (choiceunknown10.equals("dont eat")){
                System.out.println("you have escaped from a door behind the table");
            }
            if (choiceunknown5.equals("left 3")) {
                    System.out.println("you have been surrounded by moving wallsand get crushed");
            }
            if (choiceunknown5.equals("narrow path")) {
                System.out.println("you have slipped to your death and now you lose everything");
            }
            if (choiceunknown3.equals("keep looking")) {
                System.out.println("now that you past the lava part you have entered one room that is no mapped for some reason but you found it and now you have two more rooms. which way do you choose left 2 or right 2");
                String choiceunknown6 = keyboard.nextLine();
                if (choiceunknown6.equals("left 2")) {
                    System.out.println("your death is unnknown");
                }
                if (choiceunknown6.equals("right 2")) {
                    System.out.println("you have found 40 boxes of pure gold, CONGRATS YOU'RE RICH NOW.");
                }
            }

            if (choice3.equals("relax 1")) {
                System.out.println("after falling into the pit with the two opitions you found out that, at each exit there is a pit in between which do you choose the pit or the two exits.");
                String choiceunknown7 = keyboard.nextLine();
                if (choiceunknown7.equals("the pit")) {
                    System.out.println("you have fallen into water and have escaped by swimming out.");
                }
                if (choiceunknown7.equals("the two exits")) {
                    System.out.println("which of the two ways do you choose? unknown A or unknown B.");
                    if (choiceunknown7.equals("unknown A")) {
                        System.out.println("you die of fire");
                    }
                    if (choiceunknown7.equals("unknown B")) {
                        System.out.println("you get eaten alive");
                        System.out.println("fate sealed.");
                    }
                }
            }
            if (choice3.equals("relax 2")) {
                System.out.println("which one of the paths do you choose? unknown C or unknown D.");
                String choiceunknown8 = keyboard.nextLine();
                if (choiceunknown8.equals("unknown C")) {
                    System.out.println("you have gone into a room with seirens, do you wish to fight them or run away?");
                }
                String choiceunknown9 = keyboard.nextLine();
                if (choiceunknown9.equals("fight")) {
                    System.out.println("you get eaten by seirens in the water.");
                }
                if (choiceunknown9.equals("run away")) {
                    System.out.println("you fall into a pit of wild hyenas");
                }
                if (choiceunknown8.equals("unknown D")) {
                    System.out.println("you have escaped the dungeon, but unfortunately you die of leeches.");
                }
            }
        }
    }
}
