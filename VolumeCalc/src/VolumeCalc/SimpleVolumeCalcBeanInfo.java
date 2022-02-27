/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/BeanInfo.java to edit this template
 */
package VolumeCalc;

import java.beans.*;

/**
 *
 * @author Jakub
 */
public class SimpleVolumeCalcBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( VolumeCalc.SimpleVolumeCalc.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_alignmentX = 1;
    private static final int PROPERTY_alignmentY = 2;
    private static final int PROPERTY_background = 3;
    private static final int PROPERTY_backgroundSet = 4;
    private static final int PROPERTY_baselineResizeBehavior = 5;
    private static final int PROPERTY_bounds = 6;
    private static final int PROPERTY_colorModel = 7;
    private static final int PROPERTY_componentColor = 8;
    private static final int PROPERTY_componentHeight = 9;
    private static final int PROPERTY_componentListeners = 10;
    private static final int PROPERTY_componentOrientation = 11;
    private static final int PROPERTY_componentWidth = 12;
    private static final int PROPERTY_cursor = 13;
    private static final int PROPERTY_cursorSet = 14;
    private static final int PROPERTY_displayable = 15;
    private static final int PROPERTY_doubleBuffered = 16;
    private static final int PROPERTY_dropTarget = 17;
    private static final int PROPERTY_enabled = 18;
    private static final int PROPERTY_focusable = 19;
    private static final int PROPERTY_focusCycleRootAncestor = 20;
    private static final int PROPERTY_focusListeners = 21;
    private static final int PROPERTY_focusOwner = 22;
    private static final int PROPERTY_focusTraversable = 23;
    private static final int PROPERTY_focusTraversalKeys = 24;
    private static final int PROPERTY_focusTraversalKeysEnabled = 25;
    private static final int PROPERTY_font = 26;
    private static final int PROPERTY_fontSet = 27;
    private static final int PROPERTY_foreground = 28;
    private static final int PROPERTY_foregroundSet = 29;
    private static final int PROPERTY_graphics = 30;
    private static final int PROPERTY_graphicsConfiguration = 31;
    private static final int PROPERTY_height = 32;
    private static final int PROPERTY_hierarchyBoundsListeners = 33;
    private static final int PROPERTY_hierarchyListeners = 34;
    private static final int PROPERTY_ignoreRepaint = 35;
    private static final int PROPERTY_inputContext = 36;
    private static final int PROPERTY_inputMethodListeners = 37;
    private static final int PROPERTY_inputMethodRequests = 38;
    private static final int PROPERTY_keyListeners = 39;
    private static final int PROPERTY_lightweight = 40;
    private static final int PROPERTY_locale = 41;
    private static final int PROPERTY_location = 42;
    private static final int PROPERTY_locationOnScreen = 43;
    private static final int PROPERTY_maximumSize = 44;
    private static final int PROPERTY_maximumSizeSet = 45;
    private static final int PROPERTY_minimumSize = 46;
    private static final int PROPERTY_minimumSizeSet = 47;
    private static final int PROPERTY_mouseListeners = 48;
    private static final int PROPERTY_mouseMotionListeners = 49;
    private static final int PROPERTY_mousePosition = 50;
    private static final int PROPERTY_mouseWheelListeners = 51;
    private static final int PROPERTY_name = 52;
    private static final int PROPERTY_opaque = 53;
    private static final int PROPERTY_parent = 54;
    private static final int PROPERTY_peer = 55;
    private static final int PROPERTY_preferredSize = 56;
    private static final int PROPERTY_preferredSizeSet = 57;
    private static final int PROPERTY_propertyChangeListeners = 58;
    private static final int PROPERTY_showing = 59;
    private static final int PROPERTY_size = 60;
    private static final int PROPERTY_solidHeight = 61;
    private static final int PROPERTY_solidRadius = 62;
    private static final int PROPERTY_toolkit = 63;
    private static final int PROPERTY_treeLock = 64;
    private static final int PROPERTY_valid = 65;
    private static final int PROPERTY_visible = 66;
    private static final int PROPERTY_width = 67;
    private static final int PROPERTY_x = 68;
    private static final int PROPERTY_y = 69;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[70];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", VolumeCalc.SimpleVolumeCalc.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", VolumeCalc.SimpleVolumeCalc.class, "getAlignmentX", null ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", VolumeCalc.SimpleVolumeCalc.class, "getAlignmentY", null ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", VolumeCalc.SimpleVolumeCalc.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", VolumeCalc.SimpleVolumeCalc.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", VolumeCalc.SimpleVolumeCalc.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", VolumeCalc.SimpleVolumeCalc.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", VolumeCalc.SimpleVolumeCalc.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_componentColor] = new PropertyDescriptor ( "componentColor", VolumeCalc.SimpleVolumeCalc.class, "getComponentColor", "setComponentColor" ); // NOI18N
            properties[PROPERTY_componentHeight] = new PropertyDescriptor ( "componentHeight", VolumeCalc.SimpleVolumeCalc.class, "getComponentHeight", "setComponentHeight" ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", VolumeCalc.SimpleVolumeCalc.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", VolumeCalc.SimpleVolumeCalc.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentWidth] = new PropertyDescriptor ( "componentWidth", VolumeCalc.SimpleVolumeCalc.class, "getComponentWidth", "setComponentWidth" ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", VolumeCalc.SimpleVolumeCalc.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", VolumeCalc.SimpleVolumeCalc.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", VolumeCalc.SimpleVolumeCalc.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", VolumeCalc.SimpleVolumeCalc.class, "isDoubleBuffered", null ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", VolumeCalc.SimpleVolumeCalc.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", VolumeCalc.SimpleVolumeCalc.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", VolumeCalc.SimpleVolumeCalc.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", VolumeCalc.SimpleVolumeCalc.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", VolumeCalc.SimpleVolumeCalc.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", VolumeCalc.SimpleVolumeCalc.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", VolumeCalc.SimpleVolumeCalc.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", VolumeCalc.SimpleVolumeCalc.class, null, null, "getFocusTraversalKeys", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", VolumeCalc.SimpleVolumeCalc.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", VolumeCalc.SimpleVolumeCalc.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", VolumeCalc.SimpleVolumeCalc.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", VolumeCalc.SimpleVolumeCalc.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", VolumeCalc.SimpleVolumeCalc.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", VolumeCalc.SimpleVolumeCalc.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", VolumeCalc.SimpleVolumeCalc.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", VolumeCalc.SimpleVolumeCalc.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", VolumeCalc.SimpleVolumeCalc.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", VolumeCalc.SimpleVolumeCalc.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", VolumeCalc.SimpleVolumeCalc.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", VolumeCalc.SimpleVolumeCalc.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", VolumeCalc.SimpleVolumeCalc.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", VolumeCalc.SimpleVolumeCalc.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", VolumeCalc.SimpleVolumeCalc.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", VolumeCalc.SimpleVolumeCalc.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", VolumeCalc.SimpleVolumeCalc.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", VolumeCalc.SimpleVolumeCalc.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", VolumeCalc.SimpleVolumeCalc.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", VolumeCalc.SimpleVolumeCalc.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", VolumeCalc.SimpleVolumeCalc.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", VolumeCalc.SimpleVolumeCalc.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", VolumeCalc.SimpleVolumeCalc.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", VolumeCalc.SimpleVolumeCalc.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", VolumeCalc.SimpleVolumeCalc.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", VolumeCalc.SimpleVolumeCalc.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", VolumeCalc.SimpleVolumeCalc.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", VolumeCalc.SimpleVolumeCalc.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", VolumeCalc.SimpleVolumeCalc.class, "isOpaque", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", VolumeCalc.SimpleVolumeCalc.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", VolumeCalc.SimpleVolumeCalc.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", VolumeCalc.SimpleVolumeCalc.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", VolumeCalc.SimpleVolumeCalc.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", VolumeCalc.SimpleVolumeCalc.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", VolumeCalc.SimpleVolumeCalc.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", VolumeCalc.SimpleVolumeCalc.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_solidHeight] = new PropertyDescriptor ( "solidHeight", VolumeCalc.SimpleVolumeCalc.class, "getSolidHeight", "setSolidHeight" ); // NOI18N
            properties[PROPERTY_solidRadius] = new PropertyDescriptor ( "solidRadius", VolumeCalc.SimpleVolumeCalc.class, "getSolidRadius", "setSolidRadius" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", VolumeCalc.SimpleVolumeCalc.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", VolumeCalc.SimpleVolumeCalc.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", VolumeCalc.SimpleVolumeCalc.class, "isValid", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", VolumeCalc.SimpleVolumeCalc.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", VolumeCalc.SimpleVolumeCalc.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", VolumeCalc.SimpleVolumeCalc.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", VolumeCalc.SimpleVolumeCalc.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_componentListener = 0;
    private static final int EVENT_focusListener = 1;
    private static final int EVENT_hierarchyBoundsListener = 2;
    private static final int EVENT_hierarchyListener = 3;
    private static final int EVENT_inputMethodListener = 4;
    private static final int EVENT_keyListener = 5;
    private static final int EVENT_mouseListener = 6;
    private static final int EVENT_mouseMotionListener = 7;
    private static final int EVENT_mouseWheelListener = 8;
    private static final int EVENT_propertyChangeListener = 9;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[10];
    
        try {
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( VolumeCalc.SimpleVolumeCalc.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( VolumeCalc.SimpleVolumeCalc.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( VolumeCalc.SimpleVolumeCalc.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( VolumeCalc.SimpleVolumeCalc.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( VolumeCalc.SimpleVolumeCalc.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( VolumeCalc.SimpleVolumeCalc.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( VolumeCalc.SimpleVolumeCalc.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( VolumeCalc.SimpleVolumeCalc.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( VolumeCalc.SimpleVolumeCalc.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( VolumeCalc.SimpleVolumeCalc.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events
        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_addNotify2 = 2;
    private static final int METHOD_addPropertyChangeListener3 = 3;
    private static final int METHOD_applyComponentOrientation4 = 4;
    private static final int METHOD_areFocusTraversalKeysSet5 = 5;
    private static final int METHOD_bounds6 = 6;
    private static final int METHOD_calcConeVolume7 = 7;
    private static final int METHOD_calcCylinderVolume8 = 8;
    private static final int METHOD_calcSphereVolume9 = 9;
    private static final int METHOD_checkImage10 = 10;
    private static final int METHOD_checkImage11 = 11;
    private static final int METHOD_contains12 = 12;
    private static final int METHOD_contains13 = 13;
    private static final int METHOD_createImage14 = 14;
    private static final int METHOD_createImage15 = 15;
    private static final int METHOD_createVolatileImage16 = 16;
    private static final int METHOD_createVolatileImage17 = 17;
    private static final int METHOD_deliverEvent18 = 18;
    private static final int METHOD_disable19 = 19;
    private static final int METHOD_dispatchEvent20 = 20;
    private static final int METHOD_doLayout21 = 21;
    private static final int METHOD_enable22 = 22;
    private static final int METHOD_enable23 = 23;
    private static final int METHOD_enableInputMethods24 = 24;
    private static final int METHOD_firePropertyChange25 = 25;
    private static final int METHOD_firePropertyChange26 = 26;
    private static final int METHOD_firePropertyChange27 = 27;
    private static final int METHOD_firePropertyChange28 = 28;
    private static final int METHOD_firePropertyChange29 = 29;
    private static final int METHOD_firePropertyChange30 = 30;
    private static final int METHOD_getBaseline31 = 31;
    private static final int METHOD_getBounds32 = 32;
    private static final int METHOD_getComponentAt33 = 33;
    private static final int METHOD_getComponentAt34 = 34;
    private static final int METHOD_getFontMetrics35 = 35;
    private static final int METHOD_getListeners36 = 36;
    private static final int METHOD_getLocation37 = 37;
    private static final int METHOD_getPropertyChangeListeners38 = 38;
    private static final int METHOD_getSize39 = 39;
    private static final int METHOD_gotFocus40 = 40;
    private static final int METHOD_handleEvent41 = 41;
    private static final int METHOD_hasFocus42 = 42;
    private static final int METHOD_hide43 = 43;
    private static final int METHOD_imageUpdate44 = 44;
    private static final int METHOD_inside45 = 45;
    private static final int METHOD_invalidate46 = 46;
    private static final int METHOD_isFocusCycleRoot47 = 47;
    private static final int METHOD_keyDown48 = 48;
    private static final int METHOD_keyUp49 = 49;
    private static final int METHOD_layout50 = 50;
    private static final int METHOD_list51 = 51;
    private static final int METHOD_list52 = 52;
    private static final int METHOD_list53 = 53;
    private static final int METHOD_list54 = 54;
    private static final int METHOD_list55 = 55;
    private static final int METHOD_locate56 = 56;
    private static final int METHOD_location57 = 57;
    private static final int METHOD_lostFocus58 = 58;
    private static final int METHOD_minimumSize59 = 59;
    private static final int METHOD_mouseDown60 = 60;
    private static final int METHOD_mouseDrag61 = 61;
    private static final int METHOD_mouseEnter62 = 62;
    private static final int METHOD_mouseExit63 = 63;
    private static final int METHOD_mouseMove64 = 64;
    private static final int METHOD_mouseUp65 = 65;
    private static final int METHOD_move66 = 66;
    private static final int METHOD_nextFocus67 = 67;
    private static final int METHOD_paint68 = 68;
    private static final int METHOD_paintAll69 = 69;
    private static final int METHOD_postEvent70 = 70;
    private static final int METHOD_preferredSize71 = 71;
    private static final int METHOD_prepareImage72 = 72;
    private static final int METHOD_prepareImage73 = 73;
    private static final int METHOD_print74 = 74;
    private static final int METHOD_printAll75 = 75;
    private static final int METHOD_remove76 = 76;
    private static final int METHOD_removeNotify77 = 77;
    private static final int METHOD_removePropertyChangeListener78 = 78;
    private static final int METHOD_repaint79 = 79;
    private static final int METHOD_repaint80 = 80;
    private static final int METHOD_repaint81 = 81;
    private static final int METHOD_repaint82 = 82;
    private static final int METHOD_requestFocus83 = 83;
    private static final int METHOD_requestFocusInWindow84 = 84;
    private static final int METHOD_reshape85 = 85;
    private static final int METHOD_resize86 = 86;
    private static final int METHOD_resize87 = 87;
    private static final int METHOD_revalidate88 = 88;
    private static final int METHOD_setBounds89 = 89;
    private static final int METHOD_setFocusTraversalKeys90 = 90;
    private static final int METHOD_show91 = 91;
    private static final int METHOD_show92 = 92;
    private static final int METHOD_size93 = 93;
    private static final int METHOD_toString94 = 94;
    private static final int METHOD_transferFocus95 = 95;
    private static final int METHOD_transferFocusBackward96 = 96;
    private static final int METHOD_transferFocusUpCycle97 = 97;
    private static final int METHOD_update98 = 98;
    private static final int METHOD_validate99 = 99;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[100];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_addNotify2] = new MethodDescriptor(java.awt.Component.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify2].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener3] = new MethodDescriptor(java.awt.Component.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener3].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation4] = new MethodDescriptor(java.awt.Component.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation4].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet5] = new MethodDescriptor(java.awt.Component.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet5].setDisplayName ( "" );
            methods[METHOD_bounds6] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds6].setDisplayName ( "" );
            methods[METHOD_calcConeVolume7] = new MethodDescriptor(VolumeCalc.SimpleVolumeCalc.class.getMethod("calcConeVolume", new Class[] {})); // NOI18N
            methods[METHOD_calcConeVolume7].setDisplayName ( "" );
            methods[METHOD_calcCylinderVolume8] = new MethodDescriptor(VolumeCalc.SimpleVolumeCalc.class.getMethod("calcCylinderVolume", new Class[] {})); // NOI18N
            methods[METHOD_calcCylinderVolume8].setDisplayName ( "" );
            methods[METHOD_calcSphereVolume9] = new MethodDescriptor(VolumeCalc.SimpleVolumeCalc.class.getMethod("calcSphereVolume", new Class[] {})); // NOI18N
            methods[METHOD_calcSphereVolume9].setDisplayName ( "" );
            methods[METHOD_checkImage10] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage10].setDisplayName ( "" );
            methods[METHOD_checkImage11] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage11].setDisplayName ( "" );
            methods[METHOD_contains12] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains12].setDisplayName ( "" );
            methods[METHOD_contains13] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains13].setDisplayName ( "" );
            methods[METHOD_createImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage14].setDisplayName ( "" );
            methods[METHOD_createImage15] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage15].setDisplayName ( "" );
            methods[METHOD_createVolatileImage16] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage16].setDisplayName ( "" );
            methods[METHOD_createVolatileImage17] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage17].setDisplayName ( "" );
            methods[METHOD_deliverEvent18] = new MethodDescriptor(java.awt.Component.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent18].setDisplayName ( "" );
            methods[METHOD_disable19] = new MethodDescriptor(java.awt.Component.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable19].setDisplayName ( "" );
            methods[METHOD_dispatchEvent20] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent20].setDisplayName ( "" );
            methods[METHOD_doLayout21] = new MethodDescriptor(java.awt.Component.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout21].setDisplayName ( "" );
            methods[METHOD_enable22] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable22].setDisplayName ( "" );
            methods[METHOD_enable23] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable23].setDisplayName ( "" );
            methods[METHOD_enableInputMethods24] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods24].setDisplayName ( "" );
            methods[METHOD_firePropertyChange25] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange25].setDisplayName ( "" );
            methods[METHOD_firePropertyChange26] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange26].setDisplayName ( "" );
            methods[METHOD_firePropertyChange27] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange27].setDisplayName ( "" );
            methods[METHOD_firePropertyChange28] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange28].setDisplayName ( "" );
            methods[METHOD_firePropertyChange29] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange29].setDisplayName ( "" );
            methods[METHOD_firePropertyChange30] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange30].setDisplayName ( "" );
            methods[METHOD_getBaseline31] = new MethodDescriptor(java.awt.Component.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline31].setDisplayName ( "" );
            methods[METHOD_getBounds32] = new MethodDescriptor(java.awt.Component.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds32].setDisplayName ( "" );
            methods[METHOD_getComponentAt33] = new MethodDescriptor(java.awt.Component.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt33].setDisplayName ( "" );
            methods[METHOD_getComponentAt34] = new MethodDescriptor(java.awt.Component.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt34].setDisplayName ( "" );
            methods[METHOD_getFontMetrics35] = new MethodDescriptor(java.awt.Component.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics35].setDisplayName ( "" );
            methods[METHOD_getListeners36] = new MethodDescriptor(java.awt.Component.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners36].setDisplayName ( "" );
            methods[METHOD_getLocation37] = new MethodDescriptor(java.awt.Component.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation37].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners38] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners38].setDisplayName ( "" );
            methods[METHOD_getSize39] = new MethodDescriptor(java.awt.Component.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize39].setDisplayName ( "" );
            methods[METHOD_gotFocus40] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus40].setDisplayName ( "" );
            methods[METHOD_handleEvent41] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent41].setDisplayName ( "" );
            methods[METHOD_hasFocus42] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus42].setDisplayName ( "" );
            methods[METHOD_hide43] = new MethodDescriptor(java.awt.Component.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide43].setDisplayName ( "" );
            methods[METHOD_imageUpdate44] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate44].setDisplayName ( "" );
            methods[METHOD_inside45] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside45].setDisplayName ( "" );
            methods[METHOD_invalidate46] = new MethodDescriptor(java.awt.Component.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate46].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot47] = new MethodDescriptor(java.awt.Component.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot47].setDisplayName ( "" );
            methods[METHOD_keyDown48] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown48].setDisplayName ( "" );
            methods[METHOD_keyUp49] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp49].setDisplayName ( "" );
            methods[METHOD_layout50] = new MethodDescriptor(java.awt.Component.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout50].setDisplayName ( "" );
            methods[METHOD_list51] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list51].setDisplayName ( "" );
            methods[METHOD_list52] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list52].setDisplayName ( "" );
            methods[METHOD_list53] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list53].setDisplayName ( "" );
            methods[METHOD_list54] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list54].setDisplayName ( "" );
            methods[METHOD_list55] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list55].setDisplayName ( "" );
            methods[METHOD_locate56] = new MethodDescriptor(java.awt.Component.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate56].setDisplayName ( "" );
            methods[METHOD_location57] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location57].setDisplayName ( "" );
            methods[METHOD_lostFocus58] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus58].setDisplayName ( "" );
            methods[METHOD_minimumSize59] = new MethodDescriptor(java.awt.Component.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize59].setDisplayName ( "" );
            methods[METHOD_mouseDown60] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown60].setDisplayName ( "" );
            methods[METHOD_mouseDrag61] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag61].setDisplayName ( "" );
            methods[METHOD_mouseEnter62] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter62].setDisplayName ( "" );
            methods[METHOD_mouseExit63] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit63].setDisplayName ( "" );
            methods[METHOD_mouseMove64] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove64].setDisplayName ( "" );
            methods[METHOD_mouseUp65] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp65].setDisplayName ( "" );
            methods[METHOD_move66] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move66].setDisplayName ( "" );
            methods[METHOD_nextFocus67] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus67].setDisplayName ( "" );
            methods[METHOD_paint68] = new MethodDescriptor(VolumeCalc.SimpleVolumeCalc.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint68].setDisplayName ( "" );
            methods[METHOD_paintAll69] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll69].setDisplayName ( "" );
            methods[METHOD_postEvent70] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent70].setDisplayName ( "" );
            methods[METHOD_preferredSize71] = new MethodDescriptor(java.awt.Component.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize71].setDisplayName ( "" );
            methods[METHOD_prepareImage72] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage72].setDisplayName ( "" );
            methods[METHOD_prepareImage73] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage73].setDisplayName ( "" );
            methods[METHOD_print74] = new MethodDescriptor(java.awt.Component.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print74].setDisplayName ( "" );
            methods[METHOD_printAll75] = new MethodDescriptor(java.awt.Component.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll75].setDisplayName ( "" );
            methods[METHOD_remove76] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove76].setDisplayName ( "" );
            methods[METHOD_removeNotify77] = new MethodDescriptor(java.awt.Component.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify77].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener78] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener78].setDisplayName ( "" );
            methods[METHOD_repaint79] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint79].setDisplayName ( "" );
            methods[METHOD_repaint80] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint80].setDisplayName ( "" );
            methods[METHOD_repaint81] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint81].setDisplayName ( "" );
            methods[METHOD_repaint82] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint82].setDisplayName ( "" );
            methods[METHOD_requestFocus83] = new MethodDescriptor(java.awt.Component.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus83].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow84] = new MethodDescriptor(java.awt.Component.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow84].setDisplayName ( "" );
            methods[METHOD_reshape85] = new MethodDescriptor(java.awt.Component.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape85].setDisplayName ( "" );
            methods[METHOD_resize86] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize86].setDisplayName ( "" );
            methods[METHOD_resize87] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize87].setDisplayName ( "" );
            methods[METHOD_revalidate88] = new MethodDescriptor(java.awt.Component.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate88].setDisplayName ( "" );
            methods[METHOD_setBounds89] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds89].setDisplayName ( "" );
            methods[METHOD_setFocusTraversalKeys90] = new MethodDescriptor(java.awt.Component.class.getMethod("setFocusTraversalKeys", new Class[] {int.class, java.util.Set.class})); // NOI18N
            methods[METHOD_setFocusTraversalKeys90].setDisplayName ( "" );
            methods[METHOD_show91] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show91].setDisplayName ( "" );
            methods[METHOD_show92] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show92].setDisplayName ( "" );
            methods[METHOD_size93] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size93].setDisplayName ( "" );
            methods[METHOD_toString94] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString94].setDisplayName ( "" );
            methods[METHOD_transferFocus95] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus95].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward96] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward96].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle97] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle97].setDisplayName ( "" );
            methods[METHOD_update98] = new MethodDescriptor(java.awt.Component.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update98].setDisplayName ( "" );
            methods[METHOD_validate99] = new MethodDescriptor(java.awt.Component.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate99].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
        // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
    
}
