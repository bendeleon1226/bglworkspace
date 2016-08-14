package ch01.team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TeamsUtility {
	private Map<String, Team> team_map;
	
	public TeamsUtility(){
		team_map = new HashMap<String, Team>();
	}
	
	public Team getTeam(String name) {
		return team_map.get(name);
	}
	
	public List<Team> getTeams(){
		List<Team> list = new ArrayList<Team>();
		Set<String> keys = team_map.keySet();
		for(String key: keys){
			list.add(team_map.get(key));
		}
		return list;
	}
	
	public void make_test_teams(){
		List<Team> teams = new ArrayList<Team>();
		Player chico = new Player("Leonard Marx","Chico");
		Player groucho = new Player("Julius Marx","Groucho");
		Player harpo = new Player("Adolph Marx","Harpo");
		List<Player> mb = new ArrayList<Player>();
		mb.add(chico);
		mb.add(groucho);
		mb.add(harpo);
		Team marx_brothers = new Team("Marx Brothers",mb);
		teams.add(marx_brothers);
		
		Player kulasisi = new Player("Christian George Medija","kulasisi");
		Player ben01 = new Player("Ben De Leon","ben01");
		Player angpogiko = new Player("Juvy John Sedigo","angpogiko");
		List<Player> vg = new ArrayList<Player>();
		vg.add(kulasisi);
		vg.add(ben01);
		vg.add(angpogiko);
		Team vainGlory = new Team("Vain Glory",vg);
		teams.add(vainGlory);
		store_teams(teams);
	}
	
	private void store_teams(List<Team> teams){
		for(Team team: teams){
			team_map.put(team.getName(), team);
		}
	}

}
