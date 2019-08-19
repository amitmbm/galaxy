package com.indore.api;

public class UserProfile {
    private  String userId ;                 //required
    private   String address;                //required
    private   String currentCity;            //required
    private   String hometown;               //required
    private  String landmark;                //required
    private   String pincode;                //optional
    private   String education;              //required
    private   String highSchool;             //optional
    private  String college;                 //required
    private  String socialLink;              //optional
    private   String language;               //optional
    private  String aboutYou;                //required
    private  String otherNames;              //optional
    private  String hobbies;                 //optional
    private   String professionalSkills;     //required
    private   String musicArtist;            //optional
    private  String bookAuthor;              //optional
    private  String programmes;              //optional
    private  String sportsTeam;              //optional
    private  String sportsPeople;            //optional
    private  String favouriteQuotes;         //optional
    private  String lifeEvents;              //optional
    private  long createdDate;

    public UserProfile() {
    }

    private UserProfile(UserProfileBuilder builder) {
        this.userId = builder.userId;
        this.address = builder.address;
        this.currentCity = builder.currentCity;
        this.hometown = builder.hometown;
        this.landmark = builder.landmark;
        this.pincode = builder.pincode;
        this.education = builder.education;
        this.highSchool = builder.highSchool;
        this.college = builder.college;
        this.socialLink = builder.socialLink;
        this.language = builder.language;
        this.aboutYou = builder.aboutYou;
        this.otherNames = builder.otherNames;
        this.hobbies =builder. hobbies;
        this.professionalSkills =builder. professionalSkills;
        this.musicArtist = builder.musicArtist;
        this.bookAuthor = builder.bookAuthor;
        this.programmes = builder.programmes;
        this.sportsTeam = builder.sportsTeam;
        this.sportsPeople = builder.sportsPeople;
        this.favouriteQuotes = builder.favouriteQuotes;
        this.lifeEvents =builder. lifeEvents;
        this.createdDate = builder.createdDate;
    }


    public String getUserId() {
        return userId;
    }

    public String getAddress() {
        return address;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public String getHometown() {
        return hometown;
    }

    public String getLandmark() {
        return landmark;
    }

    public String getPincode() {
        return pincode;
    }

    public String getEducation() {
        return education;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public String getCollege() {
        return college;
    }

    public String getSocialLink() {
        return socialLink;
    }

    public String getLanguage() {
        return language;
    }

    public String getAboutYou() {
        return aboutYou;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getProfessionalSkills() {
        return professionalSkills;
    }

    public String getMusicArtist() {
        return musicArtist;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getProgrammes() {
        return programmes;
    }

    public String getSportsTeam() {
        return sportsTeam;
    }

    public String getSportsPeople() {
        return sportsPeople;
    }

    public String getFavouriteQuotes() {
        return favouriteQuotes;
    }

    public String getLifeEvents() {
        return lifeEvents;
    }

    public long getCreatedDate() {
        return createdDate;
    }

    public String toString() {
        return "UserProfile: " + this.userId + ", " + this.address + ", " + this.currentCity + ", " + this.hometown + ", " +
                "" + this.landmark + ",  " + this.pincode + ", " + this.education + ", " + this.highSchool + ", " + this.college + ", " +
                "" + this.socialLink + ", " + this.language + ", " + this.aboutYou + ", " + this.otherNames + ", " + this.hobbies + "," +
                " " + this.professionalSkills + ", " + this.musicArtist + ", " + this.bookAuthor + ", " + this.programmes + ", " +
                "" + this.sportsTeam + " , " + this.sportsPeople + ", " + this.favouriteQuotes + ", " + this.lifeEvents + ", " + this.createdDate;
    }

    public static class UserProfileBuilder {
        private final String userId;
        private  final String address;
        private  final String currentCity;
        private final  String hometown;
        private  final String landmark;
        private  String pincode;
        private final String education;
        private  String highSchool;
        private  final String college;
        private  String socialLink;
        private  String language;
        private final String aboutYou;
        private  String otherNames;
        private  String hobbies;
        private  final String professionalSkills;
        private  String musicArtist;
        private  String bookAuthor;
        private  String programmes;
        private  String sportsTeam;
        private  String sportsPeople;
        private  String favouriteQuotes;
        private  String lifeEvents;
        private  long createdDate;

        public UserProfileBuilder(String userId, String address, String currentCity, String hometown, String landmark, String education, String college, String aboutYou, String professionalSkills) {
            this.userId = userId;
            this.address = address;
            this.currentCity = currentCity;
            this.hometown = hometown;
            this.landmark = landmark;
            this.education = education;
            this.college = college;
            this.aboutYou = aboutYou;
            this.professionalSkills = professionalSkills;
        }

        public UserProfileBuilder pincode(String pincode) {
            this.pincode = pincode;
            return this;
        }


        public UserProfileBuilder highSchool(String highSchool) {
            this.highSchool = highSchool;
            return this;
        }

        public UserProfileBuilder socialLink(String socialLink) {
            this.socialLink = socialLink;
            return this;
        } public UserProfileBuilder language(String language) {
            this.language = language;
            return this;
        }

        public UserProfileBuilder otherNames(String otherNames) {
            this.otherNames = otherNames;
            return this;
        }
        public UserProfileBuilder hobbies(String hobbies) {
            this.hobbies = hobbies;
            return this;
        }
        public UserProfileBuilder musicArtist(String musicArtist) {
            this.musicArtist = musicArtist;
            return this;
        }
        public UserProfileBuilder bookAuthor(String bookAuthor) {
            this.bookAuthor = bookAuthor;
            return this;
        }
        public UserProfileBuilder programmes(String programmes) {
            this.programmes = programmes;
            return this;
        }
        public UserProfileBuilder sportsTeam(String sportsTeam) {
            this.sportsTeam = sportsTeam;
            return this;
        }
        public UserProfileBuilder sportsPeople(String sportsPeople) {
            this.sportsPeople = sportsPeople;
            return this;
        }
        public UserProfileBuilder favouriteQuotes(String favouriteQuotes) {
            this.favouriteQuotes = favouriteQuotes;
            return this;
        }
        public UserProfileBuilder lifeEvents(String lifeEvents) {
            this.lifeEvents = lifeEvents;
            return this;
        }
        public UserProfileBuilder createdDate(long createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public UserProfile build() {
            UserProfile user =  new UserProfile(this);
            validateUserObject(user);
            return user;
        }
        private void validateUserObject(UserProfile user) {

        }
    }
}