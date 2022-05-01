package in.nareshit;

public class SecurityModel {

	
	private String role;
	private String format;
	private String access;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	@Override
	public String toString() {
		return "SecurityModel [role=" + role + ", format=" + format + ", access=" + access + "]";
	}
	
	
}
