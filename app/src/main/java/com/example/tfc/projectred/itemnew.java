package com.example.tfc.projectred;

public class itemnew {

    int backgroundnew;
     String ProfileNamenew;
     int ProfilePhotonew;
     int nbfollowersnew;

    public itemnew() {

    }

    public itemnew(int backgroundnew, String profileNamenew, int profilePhotonew, int nbfollowersnew) {
        this.backgroundnew = backgroundnew;
        ProfileNamenew = profileNamenew;
        ProfilePhotonew = profilePhotonew;
        this.nbfollowersnew = nbfollowersnew;
    }


    public int getBackgroundnew() {
        return backgroundnew;
    }

    public String getProfileNamenew() {
        return ProfileNamenew;
    }

    public int getProfilePhotonew() {
        return ProfilePhotonew;
    }

    public int getNbfollowersnew() {
        return nbfollowersnew;
    }

    public void setBackgroundnew(int backgroundnew) {
        this.backgroundnew = backgroundnew;
    }

    public void setProfileNamenew(String profileNamenew) {
        ProfileNamenew = profileNamenew;
    }

    public void setProfilePhotonew(int profilePhotonew) {
        ProfilePhotonew = profilePhotonew;
    }

    public void setNbfollowersnew(int nbfollowersnew) {
        this.nbfollowersnew = nbfollowersnew;
    }
}
