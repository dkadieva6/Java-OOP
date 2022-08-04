package OOP.InterfacesAndAbstaction.Exercise._6_MilitaryElite.Soldiers;

import OOP.InterfacesAndAbstaction.Exercise._6_MilitaryElite.Enum.Corps;
import OOP.InterfacesAndAbstaction.Exercise._6_MilitaryElite.Interfaces.Commando;
import OOP.InterfacesAndAbstaction.Exercise._6_MilitaryElite.Mission;

import java.util.Collection;
import java.util.stream.Collectors;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private Collection<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = missions;
    }

    public void addMission(Mission mission) {
        missions.add(mission);
    }

    public Collection<Mission> getMission() {
        return missions;
    }

    public String toString() {
        //"Name: {firstName} {lastName} Id: {id} Salary: {salary}
        //Corps: {corps}
        //Missions:
        //  {mission1 ToString()}
        //  {mission2 ToString()}
        //  …
        //  {missionN ToString()}"

        return super.toString() + System.lineSeparator() +
                "Mission:" + (missions.isEmpty() ? "" : System.lineSeparator() +
                missions.stream().
                    map(m -> "  " + m).
                    collect(Collectors.joining(System.lineSeparator())));
    }
}
