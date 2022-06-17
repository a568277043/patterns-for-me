package com.aoligei.structural.facade;

/**
 * 混响音效
 *
 * @author coder
 * @date 2022-06-17 14:07:29
 * @since 1.0.0
 */
public class ReverbSoundEffectSpeaker extends Speaker {
    @Override
    public void showEffects() {
        System.out.println("        音箱使用混响音效");
    }
}
