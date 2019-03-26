package com.gr00shik.model;

import java.awt.*;

public class Computer {

    private String processor;

    private String ram;

    private Integer hddSize;

    private Dimension monitor;

    private Integer powerBlock;

    private Computer() {
    }

    public static class Builder {

        private String processor;

        private String ram;

        private Integer hddSize;

        private Dimension monitor;

        private Integer powerBlock;

        public Builder withProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder withRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder withHddSize(Integer hddSize) {
            this.hddSize = hddSize;
            return this;
        }

        public Builder withMonitor(Dimension monitor) {
            this.monitor = monitor;
            return this;
        }

        public Builder withPowerBlock(Integer powerBlock) {
            this.powerBlock = powerBlock;
            return this;
        }

        public Computer build() {
            Computer computer = new Computer();

            computer.setProcessor(processor);
            computer.setRam(ram);
            computer.setHddSize(hddSize);
            computer.setMonitor(monitor);
            computer.setPowerBlock(powerBlock);

            return computer;
        }
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Integer getHddSize() {
        return hddSize;
    }

    public void setHddSize(Integer hddSize) {
        this.hddSize = hddSize;
    }

    public Dimension getMonitor() {
        return monitor;
    }

    public void setMonitor(Dimension monitor) {
        this.monitor = monitor;
    }

    public Integer getPowerBlock() {
        return powerBlock;
    }

    public void setPowerBlock(Integer powerBlock) {
        this.powerBlock = powerBlock;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", hddSize=" + hddSize +
                ", monitor=" + monitor +
                ", powerBlock=" + powerBlock +
                '}';
    }

}
