package com.darus.jwtdemospring.security;

public class JwtConfig {
	
	public static final String LLAVE_SECRETA = "gurruwin"; 
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEowIBAAKCAQEAvmw/bvRCrwas5p9qpeO8eAepQmq+GYs1uRrXUE7vXKdGZmfL\r\n"
			+ "eL4bwuN8z4vp3iS7CrRJ0+hw6RWQomd49GHpH1ricoMh4QzlGGwDwbQcgfUDRKDY\r\n"
			+ "A3Hy6kJpC9BaXltX0ydXPmtel5UaR4HI2Y7lzzyGtzUuEX+doHWqRg25VZHsYyRP\r\n"
			+ "hEOpdBRsQN+yCaAGrJ5pOCv84yxXEissSfXFsYutmIuwkG/hPmUfyEOK5QbHuT4l\r\n"
			+ "cbdzrqMWipkvE/FOPuQF9hWEF+kEyagZ02F2gBNDBe795j6nocbMg3zolKUD4NWl\r\n"
			+ "xhucunvC3qSq7p0oxYjHLz8QdAkUcTCE9JmSgwIDAQABAoIBAQCi9BlYhtil1Q2T\r\n"
			+ "Eer+6SM4iD3VI2lojJO9wvVsuQ/m9xKswbgCrJUvMuN07KOGwWH6qAvhtrEhFZ4/\r\n"
			+ "DFMatsr7VRghrIwKfbFzM8QHOG2I3LYePZJ9aD7bL1ebj4I16u7+OFVViiZZi3QA\r\n"
			+ "q1TIsJuCu6YBFBZHTTEDxo2fA1GNoic3n8/rby4G7sm7CeFgtRunYeaE023Qg/R4\r\n"
			+ "pIs5TF0Cn3GSULOWY8hJ0v5pGBxifjKjnwkBgxEug0EE8DQ2ONcmDd10RwHetG9D\r\n"
			+ "Y7gBbb9wr9vpNI8qCs3f7fsEF4nkwISM/6orYNSAxNr23Zra2FqtW09DudBBxG8E\r\n"
			+ "8IPmUUwxAoGBAOX/iXtgbQO4FzxcYX65k231NXc3GzW3U9QC/WivRYZc05QLUYij\r\n"
			+ "GGDZh7X1SYrGIuqyDTTr0LX7VyDz7NJ3cqWthcb330CQeUwwN/OxmmjSTYxUhw6L\r\n"
			+ "zH/4sAqL+hDLctpZAAQJ9jzskkvPbRiaDOAQXbA5o5fEJziC9CTe6oqLAoGBANPz\r\n"
			+ "WI1FwOKzD7ZG6wLPeos/mm+UTIpME/B54dvhPeWHxwL9WQXNIJXmYaC1kGY9Eaj5\r\n"
			+ "NzViEFcWswuVtYk6nCF8eu2XOfu6bBxPiB2++NO9+uX7jDQ/5LbzeIKb5n1Uy4+Y\r\n"
			+ "F8S2uSIHLI2bB7UzydLiy/fpEDHLkFSkNCVexa7pAoGAShoRtoFzvh4CxnzRIJ4z\r\n"
			+ "xNqbFkTX7G+bf5RTBvZphQfFV05qP4akpReQ5OwZfK+nskwZezJ69Rb8lG5in9DC\r\n"
			+ "TGTi1B8qe8fQfN6QOGDBagJP3+Wf+ezKv3Rla5B7ygtyfqzsF2EKR8jEvc4fzSxc\r\n"
			+ "95fuR4fakFwvcsKmXHbBxE8CgYAZra3Yz86iqJcKumTWnlR2cmo/gnQTfUwdImce\r\n"
			+ "wJdDK8QMtK0IauW7w4GoetbXzCZLloX9zbe1FWbzzFuGGLe5xt8N0fiQavGWLHyN\r\n"
			+ "PgnffXDcVDGUUvlewPikukaegJt49jBLAOhFGyFmtpWkenXFOv0DOBViMwt1db9r\r\n"
			+ "l6PToQKBgGcAq3JBZRHpjWqoZRbFrFRQTA5a0119VmO0NmdgnPWuOYRae5Jnzqm5\r\n"
			+ "IWy2kDABR3uMNisuI4bw9UAXQvNIjhG4sWcsrit3A7+NAMGkGrrdMVweWD9lOs3m\r\n"
			+ "F2dtadv4JcB4lL4ZO1DjuGqzBaAKc3Mbjd/Li4RBS2Tyi5VLQgXu\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvmw/bvRCrwas5p9qpeO8\r\n"
			+ "eAepQmq+GYs1uRrXUE7vXKdGZmfLeL4bwuN8z4vp3iS7CrRJ0+hw6RWQomd49GHp\r\n"
			+ "H1ricoMh4QzlGGwDwbQcgfUDRKDYA3Hy6kJpC9BaXltX0ydXPmtel5UaR4HI2Y7l\r\n"
			+ "zzyGtzUuEX+doHWqRg25VZHsYyRPhEOpdBRsQN+yCaAGrJ5pOCv84yxXEissSfXF\r\n"
			+ "sYutmIuwkG/hPmUfyEOK5QbHuT4lcbdzrqMWipkvE/FOPuQF9hWEF+kEyagZ02F2\r\n"
			+ "gBNDBe795j6nocbMg3zolKUD4NWlxhucunvC3qSq7p0oxYjHLz8QdAkUcTCE9JmS\r\n"
			+ "gwIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
	
}
