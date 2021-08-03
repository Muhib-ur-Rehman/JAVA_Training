package com.company.throwAndThrows;

public class Main {

    public static void main(String[] args){
        Voting voting= new Voting();
        try {
            voting.doVote(14);
        } catch (VotingEception votingEception) {
            votingEception.printStackTrace();
        }
    }
}
