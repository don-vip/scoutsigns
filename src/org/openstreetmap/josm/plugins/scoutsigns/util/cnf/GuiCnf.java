package org.openstreetmap.josm.plugins.scoutsigns.util.cnf;

import java.util.Properties;


/**
 * Utility class, holds UI texts.
 *
 * @author Bea
 * @version $Revision$
 */
public final class GuiCnf {

    /** The name of the configuration file */
    private static final String CNF_FILE = "scoutsigns_gui.properties";

    private static final GuiCnf INSTANCE = new GuiCnf();

    public static GuiCnf getInstance() {
        return INSTANCE;
    }

    private final String dlgDetailsTitle;
    /* details panel tab titles */
    private final String pnlRoadSignTitle;
    private final String pnlCarPosTitle;
    private final String pnlTripTitle;

    private final String pnlCommentsTitle;
    /* details panel texts */
    private final String lblId;
    private final String lblPoint;
    private final String lblHeight;
    private final String lblConf;
    private final String lblCreated;
    private final String lblHeading;
    private final String lblDirection;
    private final String lblForward;
    private final String lblBackward;
    private final String lblAcc;
    private final String lblMode;

    private final String lblProfile;
    /* photo frame texts */
    private final String frmPhotoTitle;
    private final String lblPhotoError;

    private final String lblPhotoMissing;
    /* filter dialog texts */
    private final String dlgFilterTitle;
    private final String lblSources;
    private final String lblTimeInt;

    private final String lblUsername;
    private final String dlgCommentTitle;

    private final String txtUsernameWarning;
    /* commonly used labels */
    private final String lblType;
    private final String lblStatus;
    private final String lblDupl;
    private final String lblApp;

    private final String lblDevice;
    /* button texts */
    private final String btnOk;
    private final String btnReset;

    private final String btnCancel;
    /* warning texts */
    private final String dlgWarningTitle;
    private final String txtDuplIdInvalid;
    private final String txtConfInvalid;
    private final String txtCommentInvalid;

    private final String txtDateInvalid;

    /* info texts */
    private final String infoClusterTitle;
    private final String infoClusterTxt;
    private final String infoMapillaryTitle;
    private final String infoMapillaryTxt;
    private final String txtMenuSolve;
    private final String txtMenuInvalid;
    private final String txtMenuDuplicate;

    private final String txtMenuReopen;
    /* action dialog titles */
    private final String dlgSolveTitle;
    private final String dlgInvalidTitle;
    private final String dlgDuplicateTitle;


    private final String dlgReopenTitle;


    private GuiCnf() {
        final Properties properties = CnfUtil.load(CNF_FILE);
        dlgDetailsTitle = CnfUtil.readProperty(properties, "dialog.title");

        /* details panel tab titles */
        pnlRoadSignTitle = CnfUtil.readProperty(properties, "details.roadSign");
        pnlCarPosTitle = CnfUtil.readProperty(properties, "details.carPos");
        pnlTripTitle = CnfUtil.readProperty(properties, "details.trip");
        pnlCommentsTitle = CnfUtil.readProperty(properties, "details.comments");

        /* details panel labels */
        lblId = CnfUtil.readProperty(properties, "details.id");
        lblPoint = CnfUtil.readProperty(properties, "details.point");
        lblHeight = CnfUtil.readProperty(properties, "details.height");
        lblConf = CnfUtil.readProperty(properties, "details.conf");
        lblCreated = CnfUtil.readProperty(properties, "details.created");
        lblHeading = CnfUtil.readProperty(properties, "details.heading");
        lblDirection = CnfUtil.readProperty(properties, "details.dir");
        lblForward = CnfUtil.readProperty(properties, "details.dir.fwd");
        lblBackward = CnfUtil.readProperty(properties, "details.dir.bwd");
        lblAcc = CnfUtil.readProperty(properties, "details.acc");
        lblMode = CnfUtil.readProperty(properties, "details.mode");
        lblProfile = CnfUtil.readProperty(properties, "details.profile");

        /* photo frame texts */
        frmPhotoTitle = CnfUtil.readProperty(properties, "photo.title");
        lblPhotoError = CnfUtil.readProperty(properties, "photo.error");
        lblPhotoMissing = CnfUtil.readProperty(properties, "photo.missing");

        /* filter dialog texts */
        dlgFilterTitle = CnfUtil.readProperty(properties, "filter.title");
        lblSources = CnfUtil.readProperty(properties, "filter.sources");
        lblTimeInt = CnfUtil.readProperty(properties, "filter.int");
        lblUsername = CnfUtil.readProperty(properties, "filter.username");
        dlgCommentTitle = CnfUtil.readProperty(properties, "comment.title");
        txtUsernameWarning = CnfUtil.readProperty(properties, "warning.missing.username");

        /* commonly used texts */
        lblType = CnfUtil.readProperty(properties, "type");
        lblStatus = CnfUtil.readProperty(properties, "status");
        lblDupl = CnfUtil.readProperty(properties, "dupl");
        lblApp = CnfUtil.readProperty(properties, "app");
        lblDevice = CnfUtil.readProperty(properties, "device");

        /* button texts */
        btnOk = CnfUtil.readProperty(properties, "btn.ok");
        btnReset = CnfUtil.readProperty(properties, "btn.reset");
        btnCancel = CnfUtil.readProperty(properties, "bnt.cancel");

        dlgWarningTitle = CnfUtil.readProperty(properties, "warning.general.title");
        txtDuplIdInvalid = CnfUtil.readProperty(properties, "warning.invalid.dupl");
        txtConfInvalid = CnfUtil.readProperty(properties, "warning.invalid.conf");
        txtCommentInvalid = CnfUtil.readProperty(properties, "warning.invalid.comment");
        txtDateInvalid = CnfUtil.readProperty(properties, "warning.invalid.date");

        infoClusterTitle = CnfUtil.readProperty(properties, "info.cluster.title");
        infoClusterTxt = CnfUtil.readProperty(properties, "info.cluster.txt");
        infoMapillaryTitle = CnfUtil.readProperty(properties, "info.mapillary.title");
        infoMapillaryTxt = CnfUtil.readProperty(properties, "info.mapillary.txt");

        /* menu item texts */
        txtMenuSolve = CnfUtil.readProperty(properties, "edit.menu.solve");
        txtMenuInvalid = CnfUtil.readProperty(properties, "edit.menu.invalid");
        txtMenuDuplicate = CnfUtil.readProperty(properties, "edit.meuu.duplicate");
        txtMenuReopen = CnfUtil.readProperty(properties, "edit.menu.reopen");

        dlgSolveTitle = CnfUtil.readProperty(properties, "edit.dialog.solve");
        dlgInvalidTitle = CnfUtil.readProperty(properties, "edit.dialog.invalid");
        dlgDuplicateTitle = CnfUtil.readProperty(properties, "edit.dialog.duplicate");
        dlgReopenTitle = CnfUtil.readProperty(properties, "edit.dialog.reopen");
    }

    public String getBtnCancel() {
        return btnCancel;
    }

    public String getBtnOk() {
        return btnOk;
    }

    public String getBtnReset() {
        return btnReset;
    }

    public String getDlgCommentTitle() {
        return dlgCommentTitle;
    }

    public String getDlgDetailsTitle() {
        return dlgDetailsTitle;
    }

    public String getDlgDuplicateTitle() {
        return dlgDuplicateTitle;
    }

    public String getDlgFilterTitle() {
        return dlgFilterTitle;
    }

    public String getDlgInvalidTitle() {
        return dlgInvalidTitle;
    }

    public String getDlgReopenTitle() {
        return dlgReopenTitle;
    }

    public String getDlgSolveTitle() {
        return dlgSolveTitle;
    }

    public String getDlgWarningTitle() {
        return dlgWarningTitle;
    }

    public String getFrmPhotoTitle() {
        return frmPhotoTitle;
    }

    public String getInfoClusterTitle() {
        return infoClusterTitle;
    }

    public String getInfoClusterTxt() {
        return infoClusterTxt;
    }

    public String getInfoMapillaryTitle() {
        return infoMapillaryTitle;
    }

    public String getInfoMapillaryTxt() {
        return infoMapillaryTxt;
    }

    public String getLblAcc() {
        return lblAcc;
    }

    public String getLblApp() {
        return lblApp;
    }

    public String getLblBackward() {
        return lblBackward;
    }

    public String getLblConf() {
        return lblConf;
    }

    public String getLblCreated() {
        return lblCreated;
    }

    public String getLblDevice() {
        return lblDevice;
    }

    public String getLblDirection() {
        return lblDirection;
    }

    public String getLblDupl() {
        return lblDupl;
    }

    public String getLblForward() {
        return lblForward;
    }

    public String getLblHeading() {
        return lblHeading;
    }

    public String getLblHeight() {
        return lblHeight;
    }

    public String getLblId() {
        return lblId;
    }

    public String getLblMode() {
        return lblMode;
    }

    public String getLblPhotoError() {
        return lblPhotoError;
    }

    public String getLblPhotoMissing() {
        return lblPhotoMissing;
    }

    public String getLblPoint() {
        return lblPoint;
    }

    public String getLblProfile() {
        return lblProfile;
    }

    public String getLblSources() {
        return lblSources;
    }

    public String getLblStatus() {
        return lblStatus;
    }

    public String getLblTimeInt() {
        return lblTimeInt;
    }

    public String getLblType() {
        return lblType;
    }

    public String getLblUsername() {
        return lblUsername;
    }

    public String getPnlCarPosTitle() {
        return pnlCarPosTitle;
    }

    public String getPnlCommentsTitle() {
        return pnlCommentsTitle;
    }

    public String getPnlRoadSignTitle() {
        return pnlRoadSignTitle;
    }

    public String getPnlTripTitle() {
        return pnlTripTitle;
    }

    public String getTxtCommentInvalid() {
        return txtCommentInvalid;
    }

    public String getTxtConfInvalid() {
        return txtConfInvalid;
    }

    public String getTxtDateInvalid() {
        return txtDateInvalid;
    }

    public String getTxtDuplIdInvalid() {
        return txtDuplIdInvalid;
    }

    public String getTxtMenuDuplicate() {
        return txtMenuDuplicate;
    }

    public String getTxtMenuInvalid() {
        return txtMenuInvalid;
    }

    public String getTxtMenuReopen() {
        return txtMenuReopen;
    }

    public String getTxtMenuSolve() {
        return txtMenuSolve;
    }

    public String getTxtUsernameWarning() {
        return txtUsernameWarning;
    }
}