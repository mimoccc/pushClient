package cn.flaty.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public final class PushServiceImpl extends PushSupport implements PushService {

	
	private Logger log = LoggerFactory.getLogger(PushServiceImpl.class);
	
	
	
	public PushServiceImpl() {
		super();
	}



	@Override
	public void receiveMsg(String msg) {
		log.info(msg);
	}
	
	
}
