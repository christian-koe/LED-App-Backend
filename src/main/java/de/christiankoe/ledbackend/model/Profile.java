package de.christiankoe.ledbackend.model;

import java.util.List;

public class Profile {

    private final List<Integer> colors;
    private boolean loop;
    private int offset;
    private int delay;

    public Profile(boolean loop, int offset, int delay, List<Integer> colors) {
        this.loop = loop;
        this.offset = offset;
        this.delay = delay;
        this.colors = colors;

    }


    public void addColor(int color) {
        colors.add(color);
    }

    public void removeColor(int color) {

        colors.remove(new Integer(color));
        
    }


    @Override
    public String toString() {
        return "Profile{" +
                "loop=" + loop +
                ", offset=" + offset +
                ", delay=" + delay +
                ", colors=" + colors +
                '}';
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public List<Integer> getColors() {
        return colors;
    }


    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

}








