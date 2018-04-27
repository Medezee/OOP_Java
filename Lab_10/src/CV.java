package ua.lpnuai.oop.brusentsov10;

public class CV {
    private Id id = new Id();
    private Specialization spec = new Specialization();
    private Seniority senior = new Seniority();
    private Education edu = new Education();
    private FiredDate fd = new FiredDate();
    private MinimalWage mw = new MinimalWage();

    CV(int _id, String _spec, String _senior, String _edu, String _fd){
        System.out.println("Enter ID, Specialization, Seniority, Education, FiredDate");
        id.setId(_id);
        spec.setSpec(_spec);
        senior.setSenior(_senior);
        edu.setEdu(_edu);
        fd.setDate(_fd);
    }

    CV(int _id, String _spec, String _senior, String _edu, String _fd, int _mw){
        id.setId(_id);
        spec.setSpec(_spec);
        senior.setSenior(_senior);
        edu.setEdu(_edu);
        fd.setDate(_fd);
        mw.setMinWag(_mw);
    }


    @Override
    public String toString() {
        if(mw.getMinWag() == 0) {
            return "ID: " + id.getId() + "\n"
                    + "Specialization: " + spec.getSpec() + "\n"
                    + "Seniority: " + senior.getSenior() + "\n"
                    + "Education: " + edu.getEdu() + "\n"
                    + "Fired date: " + fd.getDate() + "\n";
        }
        else
            return "ID: " + id.getId() + "\n"
                    + "Specialization: " + spec.getSpec() + "\n"
                    + "Seniority: " + senior.getSenior() + "\n"
                    + "Education: " + edu.getEdu() + "\n"
                    + "Fired date: " + fd.getDate() + "\n"
                    + "Minimal Wage: " + mw.getMinWag() + "\n";

    }
}
