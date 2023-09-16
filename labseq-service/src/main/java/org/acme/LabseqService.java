package org.acme;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LabseqService {

    public int calculateLabseqValue(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 0;
        if (n == 3) return 1;
        return calculateLabseqValue(n - 4) + calculateLabseqValue(n - 3);
    }
}


