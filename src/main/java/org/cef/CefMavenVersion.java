package org.cef;

/**
 * This class provides information about the installed JCEF version.<br/>
 * <br/>
 * JCef Version: {version}<br/>
 * Cef Version: {native_version}<br/>
 * JCef git commit reference: {ref}
 * @author Fritz Windisch
 */
public class CefMavenVersion {
    /**
     * Retrieves the current Java Binding version.<br/>
     * Current value: {version}
     * @return Java Binding Version
     */
    public static String getJCefVersion(){
        return "{version}";
    }

    /**
     * Retrieves the current version of the bundled natives.<br/>
     * Current value: {native_version}
     * @return Native version
     */
    public static String getNativeVersion(){
        return "{native_version}";
    }

    /**
     * Retrieves the current Java Binding git commit id.<br/>
     * Current value: {ref}
     * @return Java Binding git commit reference
     */
    public static String getJCefRef(){
        return "{ref}";
    }
}
