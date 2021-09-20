package com.abhinaygarg;

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaidCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Haethorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
//        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Club");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaidCrows, 3, 8);
        adelaidCrows.matchResult(fremantle, 2, 1);

        footballLeague.add(adelaidCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);
//        footballLeague.add(baseballTeam);

        footballLeague.showLeagueTable();

    }
}
