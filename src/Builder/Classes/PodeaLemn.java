package Builder.Classes;

public class PodeaLemn implements IPodea{
    private int duritateLemn;

    public PodeaLemn(int duritateLemn) {
        this.duritateLemn = duritateLemn;
    }

    @Override
    public int getDuritate() {
        return this.duritateLemn;
    }

    @Override
    public String toString() {
        return "PodeaLemn{" +
                "duritateLemn=" + duritateLemn +
                '}';
    }
}
