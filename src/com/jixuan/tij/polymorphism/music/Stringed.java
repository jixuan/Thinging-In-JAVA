package com.jixuan.tij.polymorphism.music;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/13.
 */
public class Stringed extends Instrument {
    @Override
    public void play(Note note) {
        println(" Stringed.play() " + note);
    }
}
