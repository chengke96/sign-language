package mquinn.sign_language.imaging;

import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.core.MatOfPoint;

import java.util.List;

public class Frame extends Mat implements IFrame {

    private Mat rGBA;
    private List<MatOfPoint> contours;
    private List<MatOfPoint> hullPoints;
    private List<MatOfPoint> features;
    private List<Integer> hullDefects;

    public Frame(Mat inputRGBA) {
        rGBA = inputRGBA;
    }

    @Override
    public void setCountours(List<MatOfPoint> inputContours) {
        contours = inputContours;
    }

    @Override
    public List<MatOfPoint> getContours() {
        return contours;
    }

    @Override
    public Mat getRGBA() {
        return rGBA;
    }

    @Override
    public void setRGBA(Mat inputRGBA) {
        rGBA = inputRGBA;
    }

    @Override
    public List<MatOfPoint> getHullPoints() {
        return hullPoints;
    }

    @Override
    public void setHullPoints(List<MatOfPoint> hullPoints) {
        this.hullPoints = hullPoints;
    }

    @Override
    public List<Integer> getHullDefects() {
        return hullDefects;
    }

    @Override
    public void setHullDefects(List<Integer> hullDefects) {
        this.hullDefects = hullDefects;
    }

    @Override
    public List<MatOfPoint> getFeatures() {
        return features;
    }

    @Override
    public void setFeatures(List<MatOfPoint> features) {
        this.features = features;
    }
}
