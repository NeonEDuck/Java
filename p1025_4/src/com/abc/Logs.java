package com.abc;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Logs {  
    private int serNo; 
    private LocalDateTime start;
    private LocalDateTime end;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d H:m:s");
    
    public Logs(String items[]) {
        serNo = Integer.parseInt(items[0].trim());
        start = LocalDateTime.parse(items[1].trim(), formatter);
        end = LocalDateTime.parse(items[2].trim(), formatter);
    }
    
    public Logs() {
        serNo = 0;
        start = null;
        end = null;
    }
    
    public int getSerNo() {return serNo;}
    public LocalDateTime getStart() {return start;}
    public LocalDateTime getEnd() {return end;}
    
    public void setSerNo(int serNo) {this.serNo = serNo;}
    public void setStart(LocalDateTime start) {this.start = start;}
    public void setEnd(LocalDateTime end) {this.end = end;}
    
    public double fee() {
        long time = ChronoUnit.SECONDS.between(start, end);
        double cost = 0.06* time;
        return cost;
    }
}
