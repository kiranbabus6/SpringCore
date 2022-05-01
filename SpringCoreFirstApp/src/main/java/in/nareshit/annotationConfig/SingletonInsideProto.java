package in.nareshit.annotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sip")
public class SingletonInsideProto {

	@Autowired
	private ThePrototype tp;

	public ThePrototype getTp() {
		return tp;
	}

	public void setTp(ThePrototype tp) {
		this.tp = tp;
	}
	
	
}
