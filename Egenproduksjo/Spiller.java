class Spiller {
    private String fornavn;
    private String etternavn;
    private int alder;
    private String klubb;

    public Spiller(String fornavn, String etternavn, int alder, String klubb) {
      this.fornavn = fornavn;
      this.etternavn = etternavn;
      this.alder = alder;
      this.klubb = klubb;
    }

    public void setKlubb(String nyKlubb) {
      klubb = nyKlubb;
    }


}
