package mcrp.llc.blacklist.enums;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Status {
    RPQuality("RP Quality"), SexualRP("Sexual RP"), Slur("Slur"), MajorSlur("Major Slur");
    private final String statusString;

    public static Status getStatus(String statusString) {
        switch (statusString.toUpperCase()) {
            case "RP QUALITY":
                return Status.RPQuality;
            case "SEXUAL RP":
                return Status.SexualRP;
            case "SLUR":
                return Status.Slur;
            case "MAJOR SLUR":
                return Status.MajorSlur;
            default:
                return null;
        }
    }

    public static String getMessage(Status status) {
        switch (status) {
            case RPQuality:
                return "a";
            case SexualRP:
                return "b";
            case Slur:
                return "c";
            case MajorSlur:
                return "d";
            default:
                return null;
        }
    }
}
