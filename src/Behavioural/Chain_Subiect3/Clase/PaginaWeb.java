package Behavioural.Chain_Subiect3.Clase;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb {
    private List<IItem> items;

    public PaginaWeb() {
        this.items = new ArrayList<>();
    }

    public void adaugaItem(IItem item) {
        items.add(item);
    }

    public List<IItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "PaginaWeb{" +
                "items=" + items +
                '}';
    }
}
