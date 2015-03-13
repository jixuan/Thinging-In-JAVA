package com.jixuan.tij.polymorphism.music;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/13.
 */
public class Instrument {
    public void play(Note note) {
        println(" Instrument.play() " + note);
    }

    public void adjust() {
        println(" adjust Instrument ");
    }

    public String what() {
        return "Instrument";
    }
}
