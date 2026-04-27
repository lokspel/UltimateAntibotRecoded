package me.kr1s_d.ultimateantibot.common.service;

import me.kr1s_d.ultimateantibot.common.core.detectors.AbstractDetector;
import me.kr1s_d.ultimateantibot.common.objects.FancyInteger;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class DetectorService {
    private static final List<AbstractDetector> DETECTORS = new CopyOnWriteArrayList<>();
    private static final Map<AbstractDetector, FancyInteger> TICKDATA = new ConcurrentHashMap<>();

    public static void tickDetectors() {
        for(AbstractDetector detector : DETECTORS) {
            int tickDelay = detector.getTickDelay();
            FancyInteger i = TICKDATA.getOrDefault(detector, new FancyInteger(0));
            i.increase();
            TICKDATA.put(detector, i);

            if(tickDelay >= i.get()){
                detector.tick();
                TICKDATA.remove(detector);
            }
        }
    }

    public static void register(AbstractDetector detector){
        DETECTORS.add(detector);
    }

    public static void unregister(AbstractDetector detector){
        DETECTORS.remove(detector);
    }
}
