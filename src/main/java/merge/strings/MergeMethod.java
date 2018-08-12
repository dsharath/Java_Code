package merge.strings;

public class MergeMethod {
	
	public static String merge( String i, String j) {
		if (i == null || i.length() == 0) {
            return j;
        } else if (j == null || i.length() == 0) {
            return i;
        } else {
            final int iLength = i.length();
            final int jLength = j.length();
            final StringBuilder merged = new StringBuilder(iLength + jLength);

            for (int k = 0, l = 0; k < iLength && l < jLength; k++, l++) {
                merged.append(i.charAt(k)).append(j.charAt(l));
            }

            if (iLength != jLength) {
                if (iLength > jLength) {
                    merged.append(i.substring(jLength));
                } else {
                    merged.append(j.substring(iLength));
                }
            }
            return merged.toString();

	}
	}
	
	
	
}

	
