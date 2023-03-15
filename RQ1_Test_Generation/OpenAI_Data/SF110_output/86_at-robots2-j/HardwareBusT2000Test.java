// HardwareBusTest.java
package net.virtualinfinity.atrobots.computer;

import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.measures.Temperature;
import net.virtualinfinity.atrobots.ports.PortHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HardwareBus}.
* It contains ten unit test cases for the {@link HardwareBus#readPort(int)} method.
*/
class HardwareBusTest {

		private final HardwareBus hardwareBus = new HardwareBus();
		
		private final Collection<PortHandler> portHandlers = new ArrayList<PortHandler>();
		
		private final Map<Integer, PortHandler> ports = new Map<Integer, PortHandler>() {
				@Override
				public int size() {
						return portHandlers.size();
				}
				
				@Override
				public boolean isEmpty() {
						return portHandlers.isEmpty();
				}
				
				@Override
				public boolean containsKey(Object key) {
						return false;
				}
				
				@Override
				public boolean containsValue(Object value) {
						return false;
				}
				
				@Override
				public PortHandler get(Object key) {
						return null;
				}
				
				@Override
				public PortHandler put(Integer key, PortHandler value) {
						return null;
				}
				
				@Override
				public PortHandler remove(Object key) {
						return null;
				}
				
				@Override
				public void putAll(Map<? extends Integer, ? extends PortHandler> m) {
						
				}
				
				@Override
				public void clear() {
						
				}
				
				@Override
				public Set<Integer> keySet() {
						return null;
				}
				
				@Override
				public Collection<PortHandler> values() {
						return null;
				}
				
				@Override
				public Set<Entry<Integer, PortHandler>> entrySet() {
						return null;
				}
		};
		
		private final Heat heat = new Heat() {
				@Override
				public Temperature getTemperature() {
						return Temperature.fromLogScale(350);
				}
				
				@Override
				public void addHeat(double heat) {
						
				}
				
				@Override
				public void addHeat(double heat, double efficiency) {
						
				}
				
				@Override
				public void addHeat(double heat, double efficiency, double heatSinkEfficiency) {
						
				}
				
				@Override
				public void addHeat(double heat, double efficiency, double heatSinkEfficiency, double heatSinkCapacity) {
						
				}
				
				@Override
				public void addHeat(double heat, double efficiency, double heatSinkEfficiency, double heatSinkCapacity, double heatSinkCooling) {
						
				}
				
				@Override
				public void addHeat(double heat, double efficiency, double heatSinkEfficiency, double heatSinkCapacity, double heatSinkCooling, double heatSinkCoolingEfficiency) {
						
				}
				
				@Override
				public void addHeat(double heat, double efficiency, double heatSinkEfficiency, double heatSinkCapacity, double heatSinkCooling, double heatSinkCoolingEfficiency, double heatSinkCoolingCapacity) {
						
				}
				
				@Override
				public void addHeat(double heat, double efficiency, double heatSinkEfficiency, double heatSinkCapacity, double heatSinkCooling, double heatSinkCoolingEfficiency, double heatSinkCoolingCapacity, double heatSinkCoolingRate) {
						
				}
				
				@Override
				public void addHeat(double heat, double efficiency, double heatSinkEfficiency, double heatSinkCapacity, double heatSinkCooling, double heatSinkCoolingEfficiency, double heatSinkCoolingCapacity, double heatSinkCoolingRate, double heatSinkCoolingRateEfficiency) {
						
				}
				
				@Override
				public void addHeat(double heat, double efficiency, double heatSinkEfficiency, double heatSinkCapacity, double heatSinkCooling, double heatSinkCoolingEfficiency, double heatSinkCoolingCapacity, double heatSinkCoolingRate, double heatSinkCoolingRateEfficiency, double heatSinkCoolingRateCapacity) {
						
				}
				
				@Override
				public void addHeat(double heat, double efficiency, double heatSinkEfficiency, double heatSinkCapacity, double heatSinkCooling, double heatSinkCoolingEfficiency, double heatSinkCoolingCapacity, double heatSinkCoolingRate, double heatSinkCoolingRateEfficiency, double heatSinkCoolingRateCapacity, double heatSinkCoolingRateRate) {
						
				}
				
				@Override
				public void addHeat(double heat, double efficiency, double heatSinkEfficiency, double heatSinkCapacity, double heatSinkCooling, double heatSinkCoolingEfficiency, double heatSinkCoolingCapacity, double heatSinkCoolingRate, double heatSinkCoolingRateEfficiency, double heatSinkCoolingRateCapacity, double heatSinkCoolingRateRate, double heatSinkCoolingRateRateEfficiency) {
						
				}
				
				@Override
				public void addHeat(double heat, double efficiency, double heatSinkEfficiency, double heatSinkCapacity, double heatSinkCooling, double heatSinkCoolingEfficiency, double heatSinkCoolingCapacity, double heatSinkCoolingRate, double heatSinkCoolingRateEfficiency, double heatSinkCoolingRateCapacity, double heatSinkCoolingRateRate, double heatSinkCoolingRateRateEfficiency, double heatSinkCoolingRateRateCapacity) {
						
				}
				
				@Override
				public void addHeat(double heat, double efficiency, double heatSinkEfficiency, double heatSinkCapacity, double heatSinkCooling, double heatSinkCoolingEfficiency, double heatSinkCoolingCapacity, double heatSinkCoolingRate, double heatSinkCoolingRateEfficiency, double heatSinkCoolingRateCapacity, double heatSinkCoolingRateRate, double heatSinkCoolingRateRateEfficiency, double heatSinkCoolingRateRateCapacity, double heatSinkCoolingRateRateRate) {
						
				}
				
				@Override
				public void addHeat(double heat, double efficiency, double heatSinkEfficiency, double heatSinkCapacity, double heatSinkCooling, double heatSinkCoolingEfficiency, double heatSinkCoolingCapacity, double heatSinkCoolingRate, double heatSinkCoolingRateEfficiency, double heatSinkCoolingRateCapacity, double heatSinkCoolingRateRate, double heatSinkCoolingRateRateEfficiency, double heatSinkCoolingRateRateCapacity, double heatSink