package com.company.throwAndThrows;

public class Voting {

    public void doVote(int age) throws VotingEception{
        if (age < 18){
            throw new VotingEception("You are ineligible to vote...");
        }
        else {
            System.out.println("Thanks for voting");
        }
    }
}
