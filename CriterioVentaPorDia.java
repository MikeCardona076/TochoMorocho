package tochomorocho;

import java.util.*;
public class CriterioVentaPorDia implements Comparator<Venta> {
public int compare(Venta v1, Venta v2) {
return v1.getDia() - v2.getDia();
}
}
