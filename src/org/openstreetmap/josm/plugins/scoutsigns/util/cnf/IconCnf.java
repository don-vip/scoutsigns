package org.openstreetmap.josm.plugins.scoutsigns.util.cnf;

import java.util.Properties;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.openstreetmap.josm.tools.ImageProvider;


/**
 * Utility class, holds icons and icon paths.
 *
 * @author Bea
 * @version $Revision$
 */
public final class IconCnf {

    /** The name of the configuration file */
    private static final String CNF_FILE = "scoutsigns_icon.properties";

    /** The unique instance of the object */
    private static final IconCnf INSTANCE = new IconCnf();

    public static IconCnf getInstance() {
        return INSTANCE;
    }

    private final String shcName;

    private final Icon layerIcon;
    /* button panel icons */
    private final ImageIcon filterIcon;
    private final ImageIcon photoIcon;
    private final Icon tripIcon;
    private final ImageIcon commentIcon;
    private final Icon moreActionIcon;

    private final Icon backIcon;
    /* road sign status icons */
    private final ImageIcon openIcon;
    private final ImageIcon solvedIcon;
    private final ImageIcon invalidIcon;

    private final ImageIcon duplicateIcon;
    /* road sign icons & path names */
    private final ImageIcon selRoadSignBgIcon;
    private final String scoutTypesIconPath;
    private final String mapillaryTypesIconPath;

    private final String defaultTypeIconName;


    /* calendar icon */
    private final ImageIcon calendarIcon;


    private IconCnf() {
        final Properties properties = CnfUtil.load(CNF_FILE);
        shcName = CnfUtil.readProperty(properties, "dialog.shc");
        layerIcon = getIcon(properties, "layer.icon");
        filterIcon = getIcon(properties, "filter.icon");
        photoIcon = getIcon(properties, "photo.icon");
        tripIcon = getIcon(properties, "trip.icon");
        commentIcon = getIcon(properties, "comment.icon");
        moreActionIcon = getIcon(properties, "more.icon");
        backIcon = getIcon(properties, "back.icon");
        openIcon = getIcon(properties, "status.open.icon");
        solvedIcon = getIcon(properties, "status.solved.icon");
        invalidIcon = getIcon(properties, "status.invalid.icon");
        duplicateIcon = getIcon(properties, "status.duplicate.icon");

        selRoadSignBgIcon = getIcon(properties, "sign.sel.bg");
        scoutTypesIconPath = CnfUtil.readProperty(properties, "sign.types.scout.path");
        mapillaryTypesIconPath = CnfUtil.readProperty(properties, "sign.types.mapillary.path");
        defaultTypeIconName = CnfUtil.readProperty(properties, "sign.types.def");

        calendarIcon = getIcon(properties, "calendar.icon");
    }

    public Icon getBackIcon() {
        return backIcon;
    }

    public ImageIcon getCalendarIcon() {
        return calendarIcon;
    }

    public ImageIcon getCommentIcon() {
        return commentIcon;
    }

    public String getDefaultTypeIconName() {
        return defaultTypeIconName;
    }

    public ImageIcon getDuplicateIcon() {
        return duplicateIcon;
    }

    public ImageIcon getFilterIcon() {
        return filterIcon;
    }

    public ImageIcon getInvalidIcon() {
        return invalidIcon;
    }

    public Icon getLayerIcon() {
        return layerIcon;
    }

    public String getMapillaryTypesIconPath() {
        return mapillaryTypesIconPath;
    }

    public Icon getMoreActionIcon() {
        return moreActionIcon;
    }

    public ImageIcon getOpenIcon() {
        return openIcon;
    }

    public ImageIcon getPhotoIcon() {
        return photoIcon;
    }

    public String getScoutTypesIconPath() {
        return scoutTypesIconPath;
    }

    public ImageIcon getSelRoadSignBgIcon() {
        return selRoadSignBgIcon;
    }

    public String getShcName() {
        return shcName;
    }

    public ImageIcon getSolvedIcon() {
        return solvedIcon;
    }

    public Icon getTripIcon() {
        return tripIcon;
    }

    private ImageIcon getIcon(final Properties properties, final String key) {
        return ImageProvider.get(CnfUtil.readProperty(properties, key));
    }
}