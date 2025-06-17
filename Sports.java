import java.util.Scanner;

public class Sports {
    public int players;
    public float time;
    public String requirements;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sports is awesome!");
        System.out.println("I love playing sports.");
        System.out.println("Sports keep us healthy and fit.");
        System.out.println("There are many types of sports.");
        displaySports();

        System.out.print("Enter the sport number (1-30): ");
        int sportNumber = sc.nextInt();

        Sports selectedSport = null;

        switch (sportNumber) {
            case 1: selectedSport = new Football(); break;
            case 2: selectedSport = new Basketball(); break;
            case 3: selectedSport = new Tennis(); break;
            case 4: selectedSport = new Cricket(); break;
            case 5: selectedSport = new Baseball(); break;
            case 6: selectedSport = new Hockey(); break;
            case 7: selectedSport = new Volleyball(); break;
            case 8: selectedSport = new Swimming(); break;
            case 9: selectedSport = new Running(); break;
            case 10: selectedSport = new Cycling(); break;
            case 11: selectedSport = new Badminton(); break;
            case 12: selectedSport = new TableTennis(); break;
            case 13: selectedSport = new Golf(); break;
            case 14: selectedSport = new Rugby(); break;
            case 15: selectedSport = new Boxing(); break;
            case 16: selectedSport = new Wrestling(); break;
            case 17: selectedSport = new MartialArts(); break;
            case 18: selectedSport = new Gymnastics(); break;
            case 19: selectedSport = new Archery(); break;
            case 20: selectedSport = new Fencing(); break;
            case 21: selectedSport = new Sailing(); break;
            case 22: selectedSport = new Surfing(); break;
            case 23: selectedSport = new Snowboarding(); break;
            case 24: selectedSport = new Skiing(); break;
            case 25: selectedSport = new Skateboarding(); break;
            case 26: selectedSport = new RockClimbing(); break;
            case 27: selectedSport = new HorseRiding(); break;
            case 28: selectedSport = new Fishing(); break;
            case 29: selectedSport = new Hunting(); break;
            case 30: selectedSport = new Equestrian(); break;
            default:
                System.out.println("Invalid sport number.");
                System.exit(0);
        }

        System.out.println("\n--- Sport Details ---");
        if (selectedSport != null) {
            selectedSport.play();
        }

        sc.close();
    }

    public static void displaySports() {
        String[] sports = {
            "Football", "Basketball", "Tennis", "Cricket", "Baseball", "Hockey", "Volleyball",
            "Swimming", "Running", "Cycling", "Badminton", "Table Tennis", "Golf", "Rugby",
            "Boxing", "Wrestling", "Martial Arts", "Gymnastics", "Archery", "Fencing",
            "Sailing", "Surfing", "Snowboarding", "Skiing", "Skateboarding", "Rock Climbing",
            "Horse Riding", "Fishing", "Hunting", "Equestrian"
        };
        for (int i = 0; i < sports.length; i++) {
            System.out.println((i + 1) + ". " + sports[i]);
        }
    }

    public void play() {
        // Can be overridden
    }
}

// -------- All Sport Subclasses --------
class Football extends Sports {
    public void play() {
        this.players = 11;
        this.time = 90.0f;
        this.requirements = "A football, goalposts, and a field.";
        System.out.println("Playing Football with " + players + " players.");
        System.out.println("Match duration: " + time + " minutes.");
        System.out.println("Requirements: " + requirements);
    }
}

class Basketball extends Sports {
    public void play() {
        this.players = 5;
        this.time = 48.0f;
        this.requirements = "A basketball, hoop, and a court.";
        System.out.println("Playing Basketball with " + players + " players.");
        System.out.println("Match duration: " + time + " minutes.");
        System.out.println("Requirements: " + requirements);
    }
}

class Tennis extends Sports {
    public void play() {
        this.players = 2;
        this.time = 120.0f;
        this.requirements = "A tennis racket, ball, and a court.";
        System.out.println("Playing Tennis with " + players + " players.");
        System.out.println("Match duration: " + time + " minutes.");
        System.out.println("Requirements: " + requirements);
    }
}

class Cricket extends Sports {
    public void play() {
        this.players = 11;
        this.time = 300.0f;
        this.requirements = "A cricket bat, ball, and a pitch.";
        System.out.println("Playing Cricket with " + players + " players.");
        System.out.println("Match duration: " + time + " minutes.");
        System.out.println("Requirements: " + requirements);
    }
}

// The rest continue similarly
class Baseball extends Sports { public void play() { players = 9; time = 180.0f; requirements = "A baseball bat, ball, and a diamond."; System.out.println("Playing Baseball with " + players + " players.\nMatch duration: " + time + " minutes.\nRequirements: " + requirements); } }
class Hockey extends Sports { public void play() { players = 6; time = 60.0f; requirements = "A hockey stick, puck, and an ice rink."; System.out.println("Playing Hockey with " + players + " players.\nMatch duration: " + time + " minutes.\nRequirements: " + requirements); } }
class Volleyball extends Sports { public void play() { players = 6; time = 60.0f; requirements = "A volleyball, net, and a court."; System.out.println("Playing Volleyball with " + players + " players.\nMatch duration: " + time + " minutes.\nRequirements: " + requirements); } }
class Swimming extends Sports { public void play() { players = 1; time = 30.0f; requirements = "A swimsuit, goggles, and a pool."; System.out.println("Swimming with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
class Running extends Sports { public void play() { players = 1; time = 15.0f; requirements = "Running shoes and a track."; System.out.println("Running with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
class Cycling extends Sports { public void play() { players = 1; time = 45.0f; requirements = "A bicycle and a helmet."; System.out.println("Cycling with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
class Badminton extends Sports { public void play() { players = 2; time = 60.0f; requirements = "A badminton racket, shuttlecock, and a court."; System.out.println("Playing Badminton with " + players + " players.\nMatch duration: " + time + " minutes.\nRequirements: " + requirements); } }
class TableTennis extends Sports { public void play() { players = 2; time = 30.0f; requirements = "A table tennis racket, ball, and a table."; System.out.println("Playing Table Tennis with " + players + " players.\nMatch duration: " + time + " minutes.\nRequirements: " + requirements); } }
class Golf extends Sports { public void play() { players = 1; time = 240.0f; requirements = "A golf club, ball, and a course."; System.out.println("Playing Golf with " + players + " player.\nMatch duration: " + time + " minutes.\nRequirements: " + requirements); } }
class Rugby extends Sports { public void play() { players = 15; time = 80.0f; requirements = "A rugby ball, goalposts, and a field."; System.out.println("Playing Rugby with " + players + " players.\nMatch duration: " + time + " minutes.\nRequirements: " + requirements); } }
class Boxing extends Sports { public void play() { players = 2; time = 36.0f; requirements = "Boxing gloves, a ring, and a referee."; System.out.println("Boxing match with " + players + " players.\nMatch duration: " + time + " minutes.\nRequirements: " + requirements); } }
class Wrestling extends Sports { public void play() { players = 2; time = 10.0f; requirements = "Wrestling mat and appropriate attire."; System.out.println("Wrestling match with " + players + " players.\nMatch duration: " + time + " minutes.\nRequirements: " + requirements); } }
class MartialArts extends Sports { public void play() { players = 1; time = 60.0f; requirements = "Martial arts uniform and a dojo."; System.out.println("Practicing Martial Arts with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
class Gymnastics extends Sports { public void play() { players = 1; time = 30.0f; requirements = "Gymnastics mat and appropriate attire."; System.out.println("Practicing Gymnastics with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
class Archery extends Sports { public void play() { players = 1; time = 60.0f; requirements = "A bow, arrows, and a target."; System.out.println("Practicing Archery with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
class Fencing extends Sports { public void play() { players = 2; time = 20.0f; requirements = "Fencing swords, masks, and protective gear."; System.out.println("Fencing match with " + players + " players.\nMatch duration: " + time + " minutes.\nRequirements: " + requirements); } }
class Sailing extends Sports { public void play() { players = 1; time = 120.0f; requirements = "A sailboat and safety gear."; System.out.println("Sailing with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
class Surfing extends Sports { public void play() { players = 1; time = 60.0f; requirements = "A surfboard and appropriate attire."; System.out.println("Surfing with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
class Snowboarding extends Sports { public void play() { players = 1; time = 90.0f; requirements = "A snowboard and appropriate attire."; System.out.println("Snowboarding with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
class Skiing extends Sports { public void play() { players = 1; time = 120.0f; requirements = "Skis, poles, and appropriate attire."; System.out.println("Skiing with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
class Skateboarding extends Sports { public void play() { players = 1; time = 30.0f; requirements = "A skateboard and protective gear."; System.out.println("Skateboarding with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
class RockClimbing extends Sports { public void play() { players = 1; time = 60.0f; requirements = "Climbing gear and a climbing wall."; System.out.println("Rock Climbing with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
class HorseRiding extends Sports { public void play() { players = 1; time = 60.0f; requirements = "A horse and riding gear."; System.out.println("Horse Riding with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
class Fishing extends Sports { public void play() { players = 1; time = 120.0f; requirements = "Fishing rod, bait, and a fishing spot."; System.out.println("Fishing with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
class Hunting extends Sports { public void play() { players = 1; time = 180.0f; requirements = "Hunting gear and a hunting area."; System.out.println("Hunting with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
class Equestrian extends Sports { public void play() { players = 1; time = 60.0f; requirements = "A horse and riding gear."; System.out.println("Equestrian with " + players + " player.\nDuration: " + time + " minutes.\nRequirements: " + requirements); } }
