package id.indosw.android3dlayout.view.core;

@SuppressWarnings("unused")
public interface DepthLayout {

    int getWidth();

    int getHeight();

    DepthManager getDepthManager();

    float getRotationY();

    float getRotationX();

    void setDepth(float depth);

    void autoAnimate(boolean animate);
}
