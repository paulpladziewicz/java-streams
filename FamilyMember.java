public class FamilyMember {
    private String name;
    private int age;
    private boolean isAdult;

    private FamilyMember(FamilyMemberBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.isAdult = builder.isAdult;
    }

    public static class FamilyMemberBuilder {
        private String name;
        private int age;
        private boolean isAdult;

        public FamilyMemberBuilder(String name) {
            this.name = name;
        }

        public FamilyMemberBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public FamilyMemberBuilder setIsAdult(boolean isAdult) {
            this.isAdult = isAdult;
            return this;
        }

        public FamilyMember build() {
            return new FamilyMember(this);
        }
    }
}
