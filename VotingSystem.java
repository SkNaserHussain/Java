import java.util.Scanner;

class Voter {
    String name;
    int age;
    boolean hasVoted;

    public Voter(String name, int age) {
        this.name = name;
        this.age = age;
        this.hasVoted = false;
    }

    public boolean isEligible() {
        return age >= 18;
    }
}

class Candidate {
    String name;
    int votes;

    public Candidate(String name) {
        this.name = name;
        this.votes = 0;
    }

    public void receiveVote() {
        votes++;
    }
}

public class VotingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Candidate[] candidates = {
            new Candidate("Rohit"),
            new Candidate("Abdul"),
            new Candidate("Raju")
        };

        System.out.print("Enter your name: ");
        String voterName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Clear buffer

        Voter voter = new Voter(voterName, age);

        if (!voter.isEligible()) {
            System.out.println("You are not eligible to vote.");
            scanner.close();
            return;
        }

        System.out.println("\nCandidates:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println((i + 1) + ". " + candidates[i].name);
        }

        System.out.print("\nEnter the number of your chosen candidate: ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > candidates.length) {
            System.out.println("Invalid choice!");
        } else if (voter.hasVoted) {
            System.out.println("You have already voted!");
        } else {
            candidates[choice - 1].receiveVote();
            voter.hasVoted = true;
            System.out.println("Vote cast successfully!");
        }

        System.out.println("\nVoting Results:");
        for (Candidate c : candidates) {
            System.out.println(c.name + ": " + c.votes + " votes");
        }

        scanner.close();
    }
}
