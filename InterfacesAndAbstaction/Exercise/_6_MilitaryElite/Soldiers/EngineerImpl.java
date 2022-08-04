package OOP.InterfacesAndAbstaction.Exercise._6_MilitaryElite.Soldiers;

import OOP.InterfacesAndAbstaction.Exercise._6_MilitaryElite.Enum.Corps;
import OOP.InterfacesAndAbstaction.Exercise._6_MilitaryElite.Interfaces.Engineer;
import OOP.InterfacesAndAbstaction.Exercise._6_MilitaryElite.Repair;

import java.util.Collection;
import java.util.stream.Collectors;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private Collection<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = repairs;
    }

    public void addRepair(Repair repair) {
        repairs.add(repair);
    }

    public Collection<Repair> getRepairs() {
        return repairs;
    }

    public String toString() {
        //"Name: {firstName} {lastName} Id: {id} Salary: {salary}
        //Corps: {corps}
        //Repairs:
        //  {repair1 ToString()}
        //  {repair2 ToString()}
        //  …
        //  {repairN ToString()}"

        return super.toString() + System.lineSeparator() +
                "Repairs:" + (repairs.isEmpty() ? "" : System.lineSeparator() +
                repairs.stream().
                        map(r -> "  " + r).
                        collect(Collectors.joining(System.lineSeparator())));
    }
}
