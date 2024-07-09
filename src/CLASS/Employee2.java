package CLASS;

class Employee2 {

    // write fields
    String name;
    String email;
    int experience;

    // write constructor
    Employee2(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    // write getters
    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }

    int getExperience() {
        return experience;
    }
}

class Developer extends Employee2 {

    // write fields
    String mainLanguage;
    String[] skills;

    // write constructor
    Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    // write getters
    String getMainLanguage() {
        return mainLanguage;
    }

    String[] getSkills() {
        return skills;
    }
}

class DataAnalyst extends Employee2 {

    // write fields
    boolean phd;
    String[] methods;

    // write constructor
    DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }

    // write getters
    boolean isPhd() {
        return phd;
    }
    String[] getMethods() {
        return methods;
    }
}
