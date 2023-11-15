package practice_8_task3;

import javax.swing.*;

public class AnimationWindow extends JFrame {

    private int currentFrameIndex = 0;

    private final JLabel imageLabel;

    public static void main(String[] args) {
        new AnimationWindow(new String[]{"C:\\Users\\Popov\\OneDrive\\Изображения\\pr_8_t3_paint1.png", "C:\\Users\\Popov\\OneDrive\\Изображения\\pr_8_t3_paint2.png"});
    }

    public AnimationWindow(String[] imageUris) {
        imageLabel = new JLabel();
        add(imageLabel);
        setSize(1920, 1080);
        setVisible(true);

        startAnimation(imageUris);
    }

    private void startAnimation(String[] imageUris) {
        Timer timer = new Timer(1200, e -> {
            displayNextFrame(imageUris);
        });
        timer.start();
    }

    private void displayNextFrame(String[] imageUris) {
        if (currentFrameIndex < imageUris.length) {
            imageLabel.setIcon(new ImageIcon(imageUris[currentFrameIndex]));
        } else {
            currentFrameIndex = 0;
            imageLabel.setIcon(new ImageIcon(imageUris[currentFrameIndex]));
        }
        ++currentFrameIndex;
    }
}