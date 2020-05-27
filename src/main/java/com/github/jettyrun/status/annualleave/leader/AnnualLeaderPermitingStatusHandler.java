package com.github.jettyrun.status.annualleave.leader;

import com.github.jettyrun.LeavePermit;
import com.github.jettyrun.engine.StatusMachineEngine;
import com.github.jettyrun.status.handle.StatusHandler;
import com.github.jettyrun.status.machine.factory.StatusMachineFactory;

/**
 * Created by jetty on 18/1/9.
 */
public class AnnualLeaderPermitingStatusHandler extends StatusHandler{

    @Override
    protected void doHandler(LeavePermit leavePermit){
        System.out.println(String.format("user:%s--领导审批年休假中--leavePermit status:%s",leavePermit.getUser(),leavePermit.getStatus().getStatus()));
    }


    @Override
    protected void after(LeavePermit leavePermit){
        if(leavePermit.getEvent()==null){
            //还未审批，状态机结束，等待审批意见
            System.out.println(String.format("user:%s--等待领导审批--leavePermit status:%s",leavePermit.getUser(),leavePermit.getStatus().getStatus()));
            return;
        }
       super.goNextStatusHandler(leavePermit);
    }
}
