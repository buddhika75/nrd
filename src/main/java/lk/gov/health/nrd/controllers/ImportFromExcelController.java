/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.nrd.controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import lk.gov.health.nrd.controllers.util.JsfUtil;
import lk.gov.health.nrd.entity.Area;
import lk.gov.health.nrd.entity.Encounter;
import lk.gov.health.nrd.entity.Patient;
import lk.gov.health.nrd.enums.Sex;
import lk.gov.health.nrd.facades.PatientFacade;
import org.primefaces.model.UploadedFile;
import lk.gov.health.nrd.entity.ReferredBy;
import lk.gov.health.nrd.entity.Occupation;
import lk.gov.health.nrd.entity.Race;
import lk.gov.health.nrd.entity.Religion;
import lk.gov.health.nrd.enums.CRPunits;
import lk.gov.health.nrd.enums.DoseUnitAndFrequency;
import lk.gov.health.nrd.enums.EsrCrp;
import lk.gov.health.nrd.enums.LupusNephritis;
import lk.gov.health.nrd.enums.PositiveNegative;
import lk.gov.health.nrd.enums.SSZDoseUnitAndFrequency;
import lk.gov.health.nrd.enums.SteroidsType;

/**
 *
 * @author Buddhika
 */
@ManagedBean
@RequestScoped
public class ImportFromExcelController {

    /**
     *
     * EJBs
     *
     */
    @EJB
    PatientFacade patientFacade;
    @Inject
    AreaController areaController;
    PatientController patientController;
    /**
     *
     * Values of Excel Columns
     *
     */
    int startRow;
    /**
     *
     * Uploading File
     *
     */
    private UploadedFile file;

    /**
     *
     * Tables Columns
     *
     *
     */
    /**
     * Creates a new instance of DemographyExcelManager
     */
    public ImportFromExcelController() {
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public String importToExcel() {
        String temStr;
        double temArea;
        long temPop;

        File inputWorkbook;
        Workbook w;
        Cell cell;
        InputStream in;
        JsfUtil.addSuccessMessage(file.getFileName());
        try {
            JsfUtil.addSuccessMessage(file.getFileName());
            in = file.getInputstream();
            File f = new File("/tmp/", Calendar.getInstance().getTimeInMillis() + file.getFileName());
            FileOutputStream out = new FileOutputStream(f);
            //            OutputStream out = new FileOutputStream(new File(fileName));
            int read = 0;
            byte[] bytes = new byte[1024];
            while ((read = in.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            in.close();
            out.flush();
            out.close();
            inputWorkbook = new File(f.getAbsolutePath());
            JsfUtil.addSuccessMessage("Excel File Opened");
            w = Workbook.getWorkbook(inputWorkbook);
            Sheet sheet = w.getSheet(0);
            startRow = 1;
            for (int i = startRow; i < sheet.getRows(); i++) {

                Patient temPatient = new Patient();

                cell = sheet.getCell(0, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    Date dateOfRegistration = null;
                    dateOfRegistration = new SimpleDateFormat("dd/MM/yyyy").parse(temStr);
                    temPatient.setDateOfRegistration(dateOfRegistration);
                }
                System.out.println("date" + temStr);

                cell = sheet.getCell(2, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    temPatient.setClinicNumber(temStr);
                }
                System.out.println("CNo" + temStr);

                cell = sheet.getCell(3, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    temPatient.setNameOfPatient(temStr);
                }
                System.out.println("name" + temStr);

                cell = sheet.getCell(4, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    Date dateOfBirth = null;
                    dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(temStr);
                    temPatient.setDateOfBirth(dateOfBirth);
                }
                System.out.println("DOB" + temStr);

                cell = sheet.getCell(5, i);
                temStr = cell.getContents();
                Integer temInt1 = Integer.parseInt(temStr);
                if (!temStr.equals("")) {
                    temPatient.setAge(temStr);
                }
                System.out.println("age" + temStr);

                cell = sheet.getCell(6, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    temPatient.setNic(temStr);
                }
                System.out.println("nic" + temStr);

                cell = sheet.getCell(7, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.trim().equalsIgnoreCase("")) {
                } else if (temStr.equalsIgnoreCase("MALE")) {
                    temPatient.setSex(Sex.Male);
                } else if (temStr.equalsIgnoreCase("FEMALE")) {
                    temPatient.setSex(Sex.Female);
                }else{

}
                System.out.println("Sex" + temStr);

                cell = sheet.getCell(8, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    temPatient.setTelephoneNoMobile(temStr);
                }
                System.out.println("TelephoneNoMobile" + temStr);

                cell = sheet.getCell(9, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    temPatient.setTelephoneNoHome(temStr);
                }
                System.out.println("TelephoneNoHome" + temStr);

                cell = sheet.getCell(10, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    temPatient.setAddress(temStr);
                }
                System.out.println("Address" + temStr);

                cell = sheet.getCell(11, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.trim().equalsIgnoreCase("")) {
                } else if (temStr.equalsIgnoreCase("OPD")) {
                    temPatient.setReferredBy(ReferredBy.OPD);
                } else if (temStr.equalsIgnoreCase("Other")) {
                    temPatient.setReferredBy(ReferredBy.Other);
                } else if (temStr.equalsIgnoreCase("Other_Hospital")) {
                    temPatient.setReferredBy(ReferredBy.Other_Hospital);
                } else if (temStr.equalsIgnoreCase("Private_Sector")) {
                    temPatient.setReferredBy(ReferredBy.Private_Sector);
                } else if (temStr.equalsIgnoreCase("Ward")) {
                    temPatient.setReferredBy(ReferredBy.Ward);
                }

                System.out.println("Referred By" + temStr);

                cell = sheet.getCell(12, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.trim().equalsIgnoreCase("")) {
                } else if (temStr.equalsIgnoreCase("Clergy")) {
                    temPatient.setOccupation(Occupation.Clergy);
                } else if (temStr.equalsIgnoreCase("Clerical")) {
                    temPatient.setOccupation(Occupation.Clerical);
                } else if (temStr.equalsIgnoreCase("House_wife")) {
                    temPatient.setOccupation(Occupation.House_wife);
                } else if (temStr.equalsIgnoreCase("None")) {
                    temPatient.setOccupation(Occupation.None);
                } else if (temStr.equalsIgnoreCase("Other")) {
                    temPatient.setOccupation(Occupation.Other);
                } else if (temStr.equalsIgnoreCase("Professionals")) {
                    temPatient.setOccupation(Occupation.Professionals);
                } else if (temStr.equalsIgnoreCase("Skilled_workers")) {
                    temPatient.setOccupation(Occupation.Skilled_workers);
                } else if (temStr.equalsIgnoreCase("Student")) {
                    temPatient.setOccupation(Occupation.Student);
                } else if (temStr.equalsIgnoreCase("Unskilled_workers")) {
                    temPatient.setOccupation(Occupation.Unskilled_workers);
                }

                System.out.println("Occupation" + temStr);

                cell = sheet.getCell(13, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.trim().equalsIgnoreCase("")) {
                } else if (temStr.equalsIgnoreCase("Burgher")) {
                    temPatient.setRace(Race.Burgher);
                } else if (temStr.equalsIgnoreCase("Muslim")) {
                    temPatient.setRace(Race.Muslim);
                } else if (temStr.equalsIgnoreCase("Other")) {
                    temPatient.setRace(Race.Other);
                } else if (temStr.equalsIgnoreCase("Sinhala")) {
                    temPatient.setRace(Race.Sinhala);
                } else if (temStr.equalsIgnoreCase("Tamil")) {
                    temPatient.setRace(Race.Tamil);
                }
                System.out.println("RACE" + temStr);

                cell = sheet.getCell(14, i);
                temStr = cell.getContents();
                Area tema = areaController.getAreaByName(temStr);
                if (!temStr.equals("")) {
                    temPatient.setCity(tema);
                }
                System.out.println("city" + temStr);

                cell = sheet.getCell(15, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setRa(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setRa(false);
                }
                System.out.println("RA" + temStr);
                
                cell = sheet.getCell(16,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setOa(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setOa(false);
                }
                System.out.println("OA"+temStr);
               
                cell = sheet.getCell(17,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setJia(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setJia(false);
                }
                System.out.println("Jia"+temStr);
                
                cell = sheet.getCell(18,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setGout(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setGout(false);
                }
                System.out.println("Gout"+temStr);
                
                cell = sheet.getCell(19,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setUndifferentiated_IA(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setUndifferentiated_IA(false);
                }
                System.out.println("Undifferentiated_IA "+temStr);
                
                cell = sheet.getCell(20,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setCtd(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setCtd(false);
                }
                System.out.println("ctd "+temStr);
                
                cell = sheet.getCell(21,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setSle(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setSle(false);
                }
                System.out.println("sle "+temStr);
                
                cell = sheet.getCell(22,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setApls(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setApls(false);
                }
                System.out.println("apls"+temStr);
                
                cell = sheet.getCell(23,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setMctd(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setMctd(false);
                }
                System.out.println("mctd"+temStr);
                
                cell = sheet.getCell(24,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setScleroderma(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setScleroderma(false);
                }
                System.out.println("Scleroderma"+temStr);
                
                cell = sheet.getCell(25,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setSjogrens(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setSjogrens(false);
                }
                System.out.println("Sjogreans"+temStr);
                
                cell = sheet.getCell(26,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setDermato_Polymyositis(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setDermato_Polymyositis(false);
                }
                System.out.println("Dermato_Polymyositis"+temStr);
                
                cell = sheet.getCell(27,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setOverlap(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setOverlap(false);
                }
                System.out.println("overlap"+temStr);
                
                cell = sheet.getCell(28,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setSpA(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setSpA(false);
                }
                System.out.println("SpA"+temStr);
                
                cell = sheet.getCell(29,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setA_s(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setA_s(false);
                }
                System.out.println("AS"+temStr);
                
                cell = sheet.getCell(30,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setAxial(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setAxial(false);
                }
                System.out.println("oAxial"+temStr);
                
                cell = sheet.getCell(31,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setPeripheral(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setPeripheral(false);
                }
                System.out.println("Peripheral"+temStr);
                
                cell = sheet.getCell(32,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setMixed_Axial_and_Peripheral(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setMixed_Axial_and_Peripheral(false);
                }
                System.out.println("mixed axial"+temStr);
                
                cell = sheet.getCell(33,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setReactive(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setReactive(false);
                }
                System.out.println("Reactive"+temStr);
                
                cell = sheet.getCell(34,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setPsoriatic(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setPsoriatic(false);
                }
                System.out.println("Psoriatic"+temStr);
                
                cell = sheet.getCell(35,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setIbd_associated(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setIbd_associated(false);
                }
                System.out.println("Ibd"+temStr);
                
                cell = sheet.getCell(36,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setReiter_s(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setReiter_s(false);
                }
                System.out.println("Reiter_s"+temStr);
                
                cell = sheet.getCell(37,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setJuvenile(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setJuvenile(false);
                }
                System.out.println("Juvenile"+temStr);
                
                cell = sheet.getCell(38,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setVasculitis(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setVasculitis(false);
                }
                System.out.println(" Vasculitis"+temStr);
                
                cell = sheet.getCell(39,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setTka(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setTka(false);
                }
                System.out.println(" tka"+temStr);
                
                cell = sheet.getCell(40,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setGca(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setGca(true);
                }
                System.out.println(" GCA"+temStr);

               
                cell = sheet.getCell(41,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setPan(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setPan(false);
                }
                System.out.println("PAN"+temStr);
                
                cell = sheet.getCell(42,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setKd(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setKd(false);
                }
                System.out.println("KD"+temStr);
                
                cell = sheet.getCell(43,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setAav(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setAav(false);
                }
                System.out.println("AAV"+temStr);
                
                cell = sheet.getCell(44,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setMpa(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setMpa(false);
                }
                System.out.println("MPA"+temStr);
                
                cell = sheet.getCell(45,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setGpa_WG(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setGpa_WG(false);
                }
                System.out.println("Gpa_WG"+temStr);
                
                cell = sheet.getCell(46,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setEgpa_CSS(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setEgpa_CSS(false);
                }
                System.out.println("EGPA_CSS"+temStr);
                
                cell = sheet.getCell(47,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setAnti_GBM_GPS(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setAnti_GBM_GPS(false);
                }
                System.out.println("AntiGBM"+temStr);
                
                cell = sheet.getCell(48,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setCv(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setCv(false);
                }
                System.out.println("CV"+temStr);
                
                
                cell = sheet.getCell(49,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setIga_HSP(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setIga_HSP(false);
                }
                System.out.println("IGA "+temStr);
                
                cell = sheet.getCell(50,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setHuv(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setHuv(false);
                }
                System.out.println("HUV"+temStr);
               
                cell = sheet.getCell(51,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setBd(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setBd(false);
                }
                System.out.println("BD"+temStr);
                
                cell = sheet.getCell(52,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setSoft_Tissue_Diseases(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setSoft_Tissue_Diseases(false);
                }
                System.out.println("STD"+temStr);
                
                cell = sheet.getCell(53,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setFibromyalgia(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setFibromyalgia(false);
                }
                System.out.println("Fibromyalgia"+temStr);
                
                cell = sheet.getCell(54,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setBt(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setBt(false);
                }
                System.out.println("BT"+temStr);
                
                cell = sheet.getCell(55,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setAdhesive_Capsulitis(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setAdhesive_Capsulitis(false);
                }
                System.out.println("Adhesive cap "+temStr);

                cell = sheet.getCell(56,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setOther_SJ_Ds(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setOther_SJ_Ds(false);
                }
                System.out.println("other_SJ_Ds"+temStr);


                cell = sheet.getCell(57,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setTe(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setTe(false);
                }
                System.out.println("TE"+temStr);

                cell = sheet.getCell(58,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setGe1(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setGe1(true);
                }
                System.out.println("GE"+temStr);

                    
                cell = sheet.getCell(59,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setDqts(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setDqts(false);
                }
                System.out.println("DQTS"+temStr);

                cell = sheet.getCell(60,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setUlna_Styloid(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setUlna_Styloid(false);
                }
                System.out.println("ulna_Styloid"+temStr);
                
                cell = sheet.getCell(61,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setPf(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setPf(false);
                }
                System.out.println("PF"+temStr);

                cell = sheet.getCell(62,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setAchilles_Tendinitis(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setAchilles_Tendinitis(false);
                }
                System.out.println("achilles_Tendinitis"+temStr);


                cell = sheet.getCell(63,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setMetatarsalgia(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setMetatarsalgia(false);
                }
                System.out.println("Metatarsalgia"+temStr);
                
                cell = sheet.getCell(64,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setOther_std(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setOther_std(false);
                }
                System.out.println("other_std"+temStr);

                cell = sheet.getCell(65,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setRegional_Pain_Syndromes(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setRegional_Pain_Syndromes(false);
                }
                System.out.println("regional_Pain_Syndromes"+temStr);

                cell = sheet.getCell(66,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setBackache(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setBackache(false);
                }
                System.out.println("Backache"+temStr);

                cell = sheet.getCell(67,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setNeck_Pain(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setNeck_Pain(false);
                }
                System.out.println("Neck_Pain"+temStr);

                cell = sheet.getCell(68,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getDiagnosis().setOther_Regional_Pain_Syndromes(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getDiagnosis().setOther_Regional_Pain_Syndromes(false);
               } 
                System.out.println("Other_Regional_Pain_Syndromes"+temStr);

                cell = sheet.getCell(69, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    temPatient.getDiagnosis().setDisgnosisComments(temStr);
                }
                System.out.println("DisgnosisComments" + temStr);

               cell = sheet.getCell(70,i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("0")) {
                    temPatient.getRheumatoidArthritisData().setJointInvolvementCal(0);
                } else if (temStr.equalsIgnoreCase("1")) {
                    temPatient.getRheumatoidArthritisData().setJointInvolvementCal(1);
                }else if (temStr.equalsIgnoreCase("2")) {
                    temPatient.getRheumatoidArthritisData().setJointInvolvementCal(2);
                }else if (temStr.equalsIgnoreCase("3")) {
                    temPatient.getRheumatoidArthritisData().setJointInvolvementCal(3);
                }else if (temStr.equalsIgnoreCase("5")) {
                    temPatient.getRheumatoidArthritisData().setJointInvolvementCal(5);
                }
                System.out.println("Joint invo" + temStr);

               cell= sheet.getCell(71,i);
               temStr = cell.getContents();
               if(temStr == null){
               }else if (temStr.equalsIgnoreCase("0")){
                   temPatient.getRheumatoidArthritisData().setSerologyCal(0);
               }else if (temStr.equalsIgnoreCase("2")){
                   temPatient.getRheumatoidArthritisData().setSerologyCal(2);
               }else if (temStr.equalsIgnoreCase("3")){
                   temPatient.getRheumatoidArthritisData().setSerologyCal(3);
               }
               System.out.println("Serology" + temStr);


               cell= sheet.getCell(72,i);
               temStr = cell.getContents();
               if(temStr == null){
               }else if (temStr.equalsIgnoreCase("0")){
                   temPatient.getRheumatoidArthritisData().setAcutephaseReactantsCal(0);
               }else if (temStr.equalsIgnoreCase("1")){
                   temPatient.getRheumatoidArthritisData().setAcutephaseReactantsCal(1);
               }
               System.out.println("Acute phase" + temStr);

               cell= sheet.getCell(73,i);
               temStr = cell.getContents();
               if(temStr == null){
               }else if (temStr.equalsIgnoreCase("0")){
                   temPatient.getRheumatoidArthritisData().setDurationOfSymptomsCal(0);
               }else if (temStr.equalsIgnoreCase("1")){
                   temPatient.getRheumatoidArthritisData().setDurationOfSymptomsCal(1);
               }
               System.out.println("Duration" + temStr);
               
               try{
               cell = sheet.getCell(74, i);
                temStr = cell.getContents();
                Integer temInt2= 0;
                    temInt2 = Integer.parseInt(temStr);
                    System.out.println("int "+temInt2);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setTotalScoreTargetPopulation(temInt2);
                }
               }
               
                catch(Exception e){
                System.out.println("total" + temStr);
                }
               
               cell= sheet.getCell(75,i);
               temStr = cell.getContents();
               if(temStr == null){
               }else if (temStr.equalsIgnoreCase("Diognosis Confirmed")){
                   temPatient.getRheumatoidArthritisData().setTotalDiognosis(temStr);
               }else if (temStr.equalsIgnoreCase("Diognosis Not Confirmed")){
                   temPatient.getRheumatoidArthritisData().setTotalDiognosis(temStr);
               }
               System.out.println("Diognosis" + temStr);
               
               cell= sheet.getCell(76,i);
               temStr = cell.getContents();
                Integer temInt3= 0;
                    temInt3 = Integer.parseInt(temStr);
                    System.out.println("int "+temInt3);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setTenderJointCountDAS(temInt3);
                }
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setTenderJointCountSDAICDAI(temInt3);
                }
               System.out.println("tenderjoint" + temInt3);
              
               cell= sheet.getCell(77,i);
               temStr = cell.getContents();
                Integer temInt4= 0;
                    temInt4 = Integer.parseInt(temStr);
                    System.out.println("int "+temInt4);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setSwollenJointCountDAS(temInt4);
                }
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setSwellenJointCountSDAICDAI(temInt4);
                }
               
               System.out.println("Swolenjoint" + temInt4);
               
               cell= sheet.getCell(78,i);
               temStr = cell.getContents();
                Integer temInt5= 0;
                    temInt5= Integer.parseInt(temStr);
                    System.out.println("int "+temInt5);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setPatientGlobalHealthDAS(temInt5);
                }
               
               System.out.println("PGH" + temInt5);
               
               cell= sheet.getCell(79,i);
               temStr = cell.getContents();
                Integer temInt6= 0;
                    temInt6= Integer.parseInt(temStr);
                    System.out.println("int "+temInt6);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setResultOfEsrCrp(temInt6);
                }
               
               System.out.println("value of esr or crp" + temInt6);
               
               cell = sheet.getCell(80, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.trim().equalsIgnoreCase("")) {
                } else if (temStr.equalsIgnoreCase("CRP")) {
                    temPatient.getRheumatoidArthritisData().setEsrCrp(EsrCrp.CRP);
                } else if (temStr.equalsIgnoreCase("ESR")) {
                    temPatient.getRheumatoidArthritisData().setEsrCrp(EsrCrp.ESR);
                } 
                System.out.println("Type esr or crp " + temStr);
               
               cell = sheet.getCell(81, i);
                temStr = cell.getContents();
                if (temStr.equalsIgnoreCase("mg/l")) {
                    temPatient.getRheumatoidArthritisData().setEsrCrp(EsrCrp.CRP);
                } else {
                    temPatient.getRheumatoidArthritisData().setEsrCrp(EsrCrp.ESR);
                } 
                System.out.println("unit  E or C " + temStr);
              
                
              /* cell= sheet.getCell(82,i);
               temStr = cell.getContents();
               if(temStr == null){
               }else if (temStr.equalsIgnoreCase("Remission")){
                   temPatient.getRheumatoidArthritisData().setConfirmDAS(temStr);
               }else if (temStr.equalsIgnoreCase("Low Activity")){
                   temPatient.getRheumatoidArthritisData().setConfirmDAS(temStr);
               }else if (temStr.equalsIgnoreCase("Moderate Activity")){
                   temPatient.getRheumatoidArthritisData().setConfirmDAS(temStr);
               }else if (temStr.equalsIgnoreCase("High Activity")){
                   temPatient.getRheumatoidArthritisData().setConfirmDAS(temStr);
               }
               
               System.out.println("DAS Confirm" + temStr);
               */
              
              
               cell= sheet.getCell(83,i);
               temStr = cell.getContents();
                double temd1= 0.0;
                    temd1= Double.parseDouble(temStr);
                    System.out.println("double "+temd1);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setEsrValue(temd1);
                }
               
               System.out.println("esr" + temd1);
              
               cell = sheet.getCell(84, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    Date dateOfEsr = null;
                    dateOfEsr = new SimpleDateFormat("dd/MM/yyyy").parse(temStr);
                    temPatient.getRheumatoidArthritisData().setDateOfEsr(dateOfEsr);
                }
                System.out.println("dateOfEsr" + temStr);
               
               cell= sheet.getCell(85,i);
               temStr = cell.getContents();
                double temd2= 0.0;
                    temd2= Double.parseDouble(temStr);
                    System.out.println("double "+temd2);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setCrpValue(temd2);
                }
               
               System.out.println("crp" + temd2);
              
               cell = sheet.getCell(86, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    Date dateOfCrp = null;
                    dateOfCrp = new SimpleDateFormat("dd/MM/yyyy").parse(temStr);
                    temPatient.getRheumatoidArthritisData().setDateOfCRP(dateOfCrp);
                }
                System.out.println("dateOfCrp" + temStr);
              
               cell= sheet.getCell(87,i);
               temStr = cell.getContents();
                double temd3= 0.0;
                    temd3= Double.parseDouble(temStr);
                    System.out.println("double "+temd3);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setRfValue(temd3);
                }
               System.out.println("RF" + temd3);
              
               cell = sheet.getCell(88, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    Date dateOfRF = null;
                    dateOfRF = new SimpleDateFormat("dd/MM/yyyy").parse(temStr);
                    temPatient.getRheumatoidArthritisData().setDateOfRF(dateOfRF);
                }
                System.out.println("dateOfRF" + temStr);
               
                cell= sheet.getCell(89,i);
               temStr = cell.getContents();
                double temd4= 0.0;
                    temd4= Double.parseDouble(temStr);
                    System.out.println("double "+temd4);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setAcpaValue(temd4);
                }
               
               System.out.println("ACPA" + temd4);
              
               cell = sheet.getCell(90, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    Date dateOfAcpa = null;
                    dateOfAcpa= new SimpleDateFormat("dd/MM/yyyy").parse(temStr);
                    temPatient.getRheumatoidArthritisData().setDateOfACPA(dateOfAcpa);
                }
                System.out.println("dateOfAcpa" + temStr);
               
                 cell = sheet.getCell(91, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getRheumatoidArthritisData().setPolyarticularPresentationPoorPrognosticFactors(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                     temPatient.getRheumatoidArthritisData().setPolyarticularPresentationPoorPrognosticFactors(false);
                }
                System.out.println("PolyarticularPresentationPoorPrognosticFactors" + temStr);
                
                cell = sheet.getCell(92, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getRheumatoidArthritisData().setRfPositivePoorPrognosticFactors(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                     temPatient.getRheumatoidArthritisData().setRfPositivePoorPrognosticFactors(false);
                }
                System.out.println("RfPositive " + temStr);
                
                cell = sheet.getCell(93, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getRheumatoidArthritisData().setAntiCPAPositivePoorPrognosticFactors(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                     temPatient.getRheumatoidArthritisData().setAntiCPAPositivePoorPrognosticFactors(false);
                }
                System.out.println("AntiCPAPositive " + temStr);
                
                cell = sheet.getCell(94, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getRheumatoidArthritisData().setErosionsInXrayPoorPrognosticFactors(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                     temPatient.getRheumatoidArthritisData().setErosionsInXrayPoorPrognosticFactors(false);
                }
                System.out.println("ErosionsInXray" + temStr);
                
                 cell= sheet.getCell(95,i);
               temStr = cell.getContents();
                double temd5= 0.0;
                    temd5= Double.parseDouble(temStr);
                    System.out.println("double "+temd5);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setMtxInitialDrugTherapy(temd5);
                }
               
               System.out.println("Mtx" + temd5);
                
                cell= sheet.getCell(96,i);
               temStr = cell.getContents();
                double temd6= 0.0;
                    temd6= Double.parseDouble(temStr);
                    System.out.println("double "+temd6);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setSszInitialDrugTherapy(temd6);
                }
               
               System.out.println("SSZ" + temd6);
            /*SSZ unit 97*/
            cell = sheet.getCell(97, i);
                temStr = cell.getContents();
                if (temStr.trim().equalsIgnoreCase("mg/td")) {
                    temPatient.getRheumatoidArthritisData().setUnitofSSZ(SSZDoseUnitAndFrequency.mgPerTd);
                } else if (temStr.trim().equalsIgnoreCase("mg/bd")) {
                     temPatient.getRheumatoidArthritisData().setUnitofSSZ(SSZDoseUnitAndFrequency.mgPerBd);
                } else{
                temPatient.getRheumatoidArthritisData().setUnitofSSZ(SSZDoseUnitAndFrequency.mgPerDay);
              }
                System.out.println("ssz unit" + temStr);
            
               cell= sheet.getCell(98,i);
               temStr = cell.getContents();
                Integer temInt7= 0;
                    temInt7= Integer.parseInt(temStr);
                    System.out.println("int "+temInt7);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setLefInitialDrugTherapy(temInt7);
                }
               
               System.out.println("LEF" + temInt7);
               
               cell= sheet.getCell(99,i);
               temStr = cell.getContents();
                Integer temInt8= 0;
                    temInt8= Integer.parseInt(temStr);
                    System.out.println("int "+temInt8);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setHcqInitialDrugTherapy(temInt8);
                }
               
               System.out.println("HCQ" + temInt8);
               
               cell = sheet.getCell(100, i);
                temStr = cell.getContents();
                if (temStr.trim().equalsIgnoreCase("mgPerBd")) {
                    temPatient.getRheumatoidArthritisData().setDoseUnitAndFrequencyOfsteroidsInitialDrugTherapy(DoseUnitAndFrequency.mgPerBd);
                } else{
                    temPatient.getRheumatoidArthritisData().setDoseUnitAndFrequencyOfsteroidsInitialDrugTherapy(DoseUnitAndFrequency.mgPerDay);
                } 
                System.out.println("hcq unit" + temStr);
               
               cell = sheet.getCell(101, i);
                temStr = cell.getContents();
                if (temStr.trim().equalsIgnoreCase("Steroid_Prednisolone")) {
                    temPatient.getRheumatoidArthritisData().setSteroidsType(SteroidsType.Steroid_Prednisolone);
                } else {
                    temPatient.getRheumatoidArthritisData().setSteroidsType(SteroidsType.Steroid_M_Prednisolone);
                }
                System.out.println("steroid type" + temStr);
               
               
               
               cell= sheet.getCell(102,i);
               temStr = cell.getContents();
                Integer temInt9= 0;
                    temInt9= Integer.parseInt(temStr);
                    System.out.println("Steroid value int "+temInt9);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setSteroidsInitialDrugTherapy(temInt9);
                }
               
               System.out.println("Steroid value" + temInt9);
               
               
               cell = sheet.getCell(103, i);
                temStr = cell.getContents();
                if (temStr.trim().equalsIgnoreCase("mgPerBd")) {
                    temPatient.getRheumatoidArthritisData().setDoseUnitAndFrequencyOfsteroidsInitialDrugTherapy(DoseUnitAndFrequency.mgPerBd);
                } else{
                    temPatient.getRheumatoidArthritisData().setDoseUnitAndFrequencyOfsteroidsInitialDrugTherapy(DoseUnitAndFrequency.mgPerDay);
                } 
                System.out.println("steroid unit" + temStr);
               
               
               
               cell= sheet.getCell(104,i);
               temStr = cell.getContents();
                Integer temInt10= 0;
                    temInt10= Integer.parseInt(temStr);
                    System.out.println("PGA int "+temInt10);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setPatientGlobalAssessmentSDAICDAI(temInt10);
                }
               
               System.out.println("PGA sdai/cdaivalue" + temInt10);
               
               cell= sheet.getCell(105,i);
               temStr = cell.getContents();
                Integer temInt11= 0;
                    temInt11= Integer.parseInt(temStr);
                    System.out.println("EGA int "+temInt11);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setEvaluatorGlobalAssessmentSDAICDAI(temInt11);
                }
               
               System.out.println("EGA sdai/cdaivalue" + temInt11);
               
               cell= sheet.getCell(106,i);
               temStr = cell.getContents();
                double temd7= 0.0;
                    temd7= Double.parseDouble(temStr);
                    System.out.println("double "+temd7);
                if (!temStr.equals("")) {
                    temPatient.getRheumatoidArthritisData().setCrpSDAICDAI(temd7);
                }
               
               System.out.println("CRP value" + temd7);
               
               
               cell = sheet.getCell(107, i);
                temStr = cell.getContents();
                if (temStr.trim().equalsIgnoreCase("mgPerDl")) {
                    temPatient.getRheumatoidArthritisData().setUnitofCRP(CRPunits.mgPerDl);
                } else{
                    temPatient.getRheumatoidArthritisData().setUnitofCRP(CRPunits.mgPerL);
                } 
                System.out.println("crp  unit" + temStr);
               
               cell = sheet.getCell(108, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria1(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria1(false);
                }
                System.out.println("CC1" + temStr);
               
                cell = sheet.getCell(109, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria2(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria2(false);
                }
                System.out.println("CC2" + temStr);
                
                cell = sheet.getCell(110, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria3(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria3(false);
                }
                System.out.println("CC3" + temStr);
                
                cell = sheet.getCell(111, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria4(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria4(false);
                }
                System.out.println("CC4" + temStr);
                
                cell = sheet.getCell(112, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria5(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria5(false);
                }
                System.out.println("CC5" + temStr);
                
                cell = sheet.getCell(113, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria6(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria6(false);
                }
                System.out.println("CC6" + temStr);
                
                cell = sheet.getCell(114, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria7(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria7(false);
                }
                System.out.println("CC7" + temStr);
                
                cell = sheet.getCell(115, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria8(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria8(false);
                }
                System.out.println("CC8" + temStr);
                
                cell = sheet.getCell(116, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria9(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria9(false);
                }
                System.out.println("CC9 " + temStr);
                
                cell = sheet.getCell(117, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria10(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria10(false);
                }
                System.out.println("CC10 " + temStr);
                
                cell = sheet.getCell(118, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria11(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setClinicalCriteria11(false);
                }
                System.out.println("CC11 " + temStr);
                
                cell = sheet.getCell(119, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setImmunologicCriteria1(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setImmunologicCriteria1(false);
                }
                System.out.println("IC1 " + temStr);
                
                cell = sheet.getCell(120, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setImmunologicCriteria2(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setImmunologicCriteria2(false);
                }
                System.out.println("IC2 " + temStr);
                
                cell = sheet.getCell(121, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setImmunologicCriteria3(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setImmunologicCriteria3(false);
                }
                System.out.println("IC3 " + temStr);
                
                cell = sheet.getCell(122, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setImmunologicCriteria4(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setImmunologicCriteria4(false);
                }
                System.out.println("IC4 " + temStr);
                
                cell = sheet.getCell(123, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setImmunologicCriteria5(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setImmunologicCriteria5(false);
                }
                System.out.println("IC5 " + temStr);
                
                cell = sheet.getCell(124, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setImmunologicCriteria6(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setImmunologicCriteria6(false);
                }
                System.out.println("IC6 " + temStr);
                
                
                cell = sheet.getCell(125, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.trim().equalsIgnoreCase("")) {
                } else if (temStr.equalsIgnoreCase("ClassI")) {
                    temPatient.getSystemicLupusErythematosusData().setLupusNephritis(LupusNephritis.ClassI);
                } else if (temStr.equalsIgnoreCase("ClassII")) {
                    temPatient.getSystemicLupusErythematosusData().setLupusNephritis(LupusNephritis.ClassII);
                } else if (temStr.equalsIgnoreCase("ClassIII")) {
                    temPatient.getSystemicLupusErythematosusData().setLupusNephritis(LupusNephritis.ClassIII);
                }else if (temStr.equalsIgnoreCase("ClassIV")) {
                    temPatient.getSystemicLupusErythematosusData().setLupusNephritis(LupusNephritis.ClassIV);
                } else if (temStr.equalsIgnoreCase("ClassV")) {
                    temPatient.getSystemicLupusErythematosusData().setLupusNephritis(LupusNephritis.ClassV);
                }  
                
                System.out.println("LupusNephritis class: " + temStr);
               
                
                cell = sheet.getCell(126, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSystemicLupusErythematosusData().setComplicationRespiratory(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSystemicLupusErythematosusData().setComplicationRespiratory(false);
                }
                System.out.println("Respiratory " + temStr);
                
                cell = sheet.getCell(127, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    temPatient.getSystemicLupusErythematosusData().setOtherComplication(temStr);
                }
                System.out.println("Comments" + temStr);

                
                cell = sheet.getCell(128, i);
                temStr = cell.getContents();
                Integer temInt12 = Integer.parseInt(temStr);
                if (!temStr.equals("")) {
                    temPatient.getSystemicLupusErythematosusData().setSledaiTotal(temInt12);
                }
                System.out.println("Sledai Total " + temStr);
                
                
                cell = sheet.getCell(129, i);
                temStr = cell.getContents();
                if (temStr.trim().equalsIgnoreCase("Negative")) {
                    temPatient.getSpondyloarthristisData().setXrayPN(PositiveNegative.Two);
                } else{
                    temPatient.getSpondyloarthristisData().setXrayPN(PositiveNegative.One);
                } 
                System.out.println("x ray Posi or nega" + temStr);
                
                
                cell = sheet.getCell(130, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setIbp(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setIbp(false);
                }
                System.out.println("IBP " + temStr);
                
                
                cell = sheet.getCell(131, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setAbp(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setAbp(false);
                }
                System.out.println(" ABP" + temStr);
                
                
                cell = sheet.getCell(132, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setGrtn(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setGrtn(false);
                }
                System.out.println(" GRTN" + temStr);
                
                cell = sheet.getCell(133, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setPa(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setPa(false);
                }
                System.out.println("PA " + temStr);
                
                cell = sheet.getCell(134, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setEnthesitis(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setEnthesitis(false);
                }
                System.out.println(" Enthesitis" + temStr);
                
                cell = sheet.getCell(135, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setDactylitis(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setDactylitis(false);
                }
                System.out.println(" Dactylitis" + temStr);
                
                cell = sheet.getCell(136, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setPsoriasis(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setPsoriasis(false);
                }
                System.out.println("Psoriasis " + temStr);
                
                cell = sheet.getCell(137, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setIbd(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setIbd(false);
                }
                System.out.println("IBD " + temStr);
                
                cell = sheet.getCell(138, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setUveitis(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setUveitis(false);
                }
                System.out.println("Uveitis " + temStr);
                
                cell = sheet.getCell(139, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setEapr(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setEapr(false);
                }
                System.out.println(" EAPR" + temStr);
                
                cell = sheet.getCell(140, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setPi(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setPi(false);
                }
                System.out.println(" Pi" + temStr);
                
                cell = sheet.getCell(141, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setPfh(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setPfh(false);
                }
                System.out.println(" PFH" + temStr);
                
                
                cell = sheet.getCell(142, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setSacroiliitis(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setSacroiliitis(false);
                }
                System.out.println("Sacroiliitis " + temStr);
                
                
                cell = sheet.getCell(143, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setUorcorADO(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setUorcorADO(false);
                }
                System.out.println("UorcorADO " + temStr);
                
                /*144  HLA -B27 Positive negative*/
                cell = sheet.getCell(144, i);
                temStr = cell.getContents();
                if (temStr.trim().equalsIgnoreCase("Negative")) {
                    temPatient.getSpondyloarthristisData().setHlaPN(PositiveNegative.Two);
                } else{
                    temPatient.getSpondyloarthristisData().setHlaPN(PositiveNegative.One);
                } 
                System.out.println("HLA Posi or nega" + temStr);
                
                
                cell = sheet.getCell(145, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setDiagnosisAxialSpA(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setDiagnosisAxialSpA(false);
                }
                System.out.println("DiagnosisAxialSpA" + temStr);
                
                 cell = sheet.getCell(146, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setDiagnosisPeripheralSpA(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setDiagnosisPeripheralSpA(false);
                }
                System.out.println("DiagnosisPeripheralSpA" + temStr);
                
                cell = sheet.getCell(147, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    temPatient.getSpondyloarthristisData().setOtherDiagnosis(temStr);
                }
                System.out.println("otherdiagnoo" + temStr);
                
                
                cell = sheet.getCell(148, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setAnkylosingSp(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setAnkylosingSp(false);
                }
                System.out.println("AnkylosingSp" + temStr);
                
                cell = sheet.getCell(149, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setPsoriaticA(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setPsoriaticA(false);
                }
                System.out.println("PsoriaticA" + temStr);
                
                cell = sheet.getCell(150, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setIbdassociatedSpA(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setIbdassociatedSpA(false);
                }
                System.out.println("ibdassociatedSpA" + temStr);
                
                cell = sheet.getCell(151, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setReactiveA(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setReactiveA(false);
                }
                System.out.println("reactiveA" + temStr);
                
                cell = sheet.getCell(152, i);
                temStr = cell.getContents();
                if (temStr == null) {
                } else if (temStr.equalsIgnoreCase("yes")) {
                    temPatient.getSpondyloarthristisData().setUndifferentiatedSpA(true);
                } else if (temStr.equalsIgnoreCase("no")) {
                    temPatient.getSpondyloarthristisData().setUndifferentiatedSpA(false);
                }
                System.out.println("undifferentiatedSpA" + temStr);
                
                cell = sheet.getCell(153, i);
                temStr = cell.getContents();
                if (!temStr.equals("")) {
                    temPatient.getSpondyloarthristisData().setOtherTypeofSpA(temStr);
                }
                System.out.println("otherTypeofSpondyloarthritis" + temStr);
                
                cell= sheet.getCell(154,i);
               temStr = cell.getContents();
                Integer temInt13= 0;
                    temInt13= Integer.parseInt(temStr);
                    System.out.println("int "+temInt13);
                if (!temStr.equals("")) {
                    temPatient.getSpondyloarthristisData().setBasdaiFatigue(temInt13);
                }
               
               System.out.println("FATIGue" + temInt13);
               
               cell= sheet.getCell(155,i);
               temStr = cell.getContents();
                Integer temInt14= 0;
                    temInt14= Integer.parseInt(temStr);
                    System.out.println("int "+temInt14);
                if (!temStr.equals("")) {
                    temPatient.getSpondyloarthristisData().setBasdaiSpinalPain(temInt14);
                    temPatient.getSpondyloarthristisData().setAsdasSpinalPain(temInt14);
                }
               
               System.out.println(" SpinalPain " + temInt14);
               
               
               cell= sheet.getCell(156,i);
               temStr = cell.getContents();
                Integer temInt15= 0;
                    temInt15= Integer.parseInt(temStr);
                    System.out.println("int "+temInt15);
                if (!temStr.equals("")) {
                    temPatient.getSpondyloarthristisData().setBasdaiPeripheralArthritis(temInt15);
                    temPatient.getSpondyloarthristisData().setAsdasPeripheralArthritis(temInt15);
                }
               
               System.out.println(" PA " + temInt15);
               
               cell= sheet.getCell(157,i);
               temStr = cell.getContents();
                Integer temInt16= 0;
                    temInt16= Integer.parseInt(temStr);
                    System.out.println("int "+temInt16);
                if (!temStr.equals("")) {
                    temPatient.getSpondyloarthristisData().setBasdaiEnthesitis(temInt16);
                }
               
               System.out.println(" Enthesitis " + temInt16);
               
               cell= sheet.getCell(158,i);
               temStr = cell.getContents();
                Integer temInt17= 0;
                    temInt17= Integer.parseInt(temStr);
                    System.out.println("int "+temInt17);
                if (!temStr.equals("")) {
                    temPatient.getSpondyloarthristisData().setBasdaiMorningStiffnessIntensity(temInt17);
                }
               
               System.out.println(" MSI " + temInt17);
               
                cell= sheet.getCell(159,i);
               temStr = cell.getContents();
                double temd8= 0.0;
                    temd8= Double.parseDouble(temStr);
                    System.out.println("double "+temd8);
                if (!temStr.equals("")) {
                    temPatient.getSpondyloarthristisData().setBasdaiMorningStiffnessDuration(temd8);
                    temPatient.getSpondyloarthristisData().setAsdasMorningStiffnessDuration(temd8);
                }
               
               System.out.println("MSD" + temd8);
               
               
               
               cell= sheet.getCell(160,i);
               temStr = cell.getContents();
                Integer temInt18= 0;
                    temInt18= Integer.parseInt(temStr);
                    System.out.println("int "+temInt18);
                if (!temStr.equals("")) {
                    temPatient.getSpondyloarthristisData().setAsdasPatientGlobalAssessmennt(temInt18);
                }
               
               System.out.println(" PGA " + temInt18);
               
               
               cell= sheet.getCell(161,i);
               temStr = cell.getContents();
                double temd9= 0.0;
                    temd9= Double.parseDouble(temStr);
                    System.out.println("double "+temd9);
                if (!temStr.equals("")) {
                   temPatient.getSpondyloarthristisData().setAsdasEsr(temd9);
                }
               
               System.out.println("asdas ESR" + temd9);
               
               cell= sheet.getCell(162,i);
               temStr = cell.getContents();
                double temd10= 0.0;
                    temd10= Double.parseDouble(temStr);
                    System.out.println("double "+temd10);
                if (!temStr.equals("")) {
                    temPatient.getSpondyloarthristisData().setAsdasCrp(temd10);
                }
               
               System.out.println("asdas CRP" + temd10);
               /*CRP unit 163 */
               
               
               cell = sheet.getCell(163, i);
                temStr = cell.getContents();
                if (temStr.trim().equalsIgnoreCase("mgPerDl")) {
                    temPatient.getSpondyloarthristisData().setUnitofCRP(CRPunits.mgPerDl);
                } else{
                     temPatient.getSpondyloarthristisData().setUnitofCRP(CRPunits.mgPerL);
                } 
                System.out.println("crp  unit" + temStr);
             
              
                
                
                patientFacade.create(temPatient);
                
                totalOfTargtPopulationcal(temPatient);
                
                
                patientFacade.edit(temPatient);
                
                
                
            }
            FacesMessage msg = new FacesMessage("Succesful", "All the data in Excel File Impoted to the database");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return "/patient/patient_search";
        } catch (IOException ex) {
            JsfUtil.addErrorMessage(ex.getMessage());
            return "";
        } catch (BiffException e) {
            JsfUtil.addErrorMessage(e.getMessage());
            return "";
        } catch (ParseException ex) {
            Logger.getLogger(ImportFromExcelController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "/patient/patient_search";
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }
   
    public void totalOfTargtPopulationcal(Patient temPatient) {
       
        System.out.println("cal = ");
        int total;
        String x = "Diognosis Confirmed";
        String y = "Diognosis Not Confirmed";
        String das1 = "Remission";
        String das2 = "Low Activity";
        String das3 = "Moderate Activity";
        String das4 = "High Activity";
        String scReference1 = "Remission";
        String scReference2 = "Low Activity";
        String scReference3 = "Moderate Activity";
        String scReference4 = "High Activity";
        
        if (temPatient == null) {
            return;
        }
        int a = temPatient.getRheumatoidArthritisData().getAcutephaseReactantsCal();
        int b =temPatient.getRheumatoidArthritisData().getDurationOfSymptomsCal();
        int c = temPatient.getRheumatoidArthritisData().getSerologyCal();
        int d = temPatient.getRheumatoidArthritisData().getJointInvolvementCal();
        int p = temPatient.getRheumatoidArthritisData().getPatientGlobalHealthDAS();
        int t = temPatient.getRheumatoidArthritisData().getTenderJointCountDAS();
        int s = temPatient.getRheumatoidArthritisData().getSwollenJointCountDAS();
        int pga = temPatient.getRheumatoidArthritisData().getPatientGlobalAssessmentSDAICDAI();
        int ega = temPatient.getRheumatoidArthritisData().getEvaluatorGlobalAssessmentSDAICDAI();
        double esrORcrp = temPatient.getRheumatoidArthritisData().getResultOfEsrCrp();
        
        
        double dastotal = 0;
        
        total = a + b + c + d;
        temPatient.getRheumatoidArthritisData().setTotalScoreTargetPopulation(total);
        if (total > 5) {
            temPatient.getRheumatoidArthritisData().setTotalDiognosis(x);

        } else {
            temPatient.getRheumatoidArthritisData().setTotalDiognosis(y);
        }

        double eC= 0;
        
        if (temPatient.getRheumatoidArthritisData().getEsrCrp() != null) {
            switch (temPatient.getRheumatoidArthritisData().getEsrCrp()) {
                case ESR:
                       eC =0.7 * Math.log1p(esrORcrp-1);
                        break;
                case CRP:
                        eC =0.36 * Math.log1p(esrORcrp) + 0.96;
                         break;
            }
        }
 
        double lnt = 0.56*(Math.sqrt(t*1.0));
        double lns = 0.28*(Math.sqrt(s*1.0));
        double lnp = 0.014*(p*1.0);
        
        double dastotal1;
        dastotal1 = eC + lnp + lnt + lns;
        double dastotal1round = (double) Math.round(dastotal1 * 100d) / 100d;
        temPatient.getRheumatoidArthritisData().setCalculatedScoreDAS(dastotal1round);
        
        if(dastotal1round < 2.6 ){
        temPatient.getRheumatoidArthritisData().setConfirmDAS(das1);
        }
        if(dastotal1round > 2.6 ){
            if(dastotal1round < 3.2 ){
            temPatient.getRheumatoidArthritisData().setConfirmDAS(das2);
            }
        }
        if(dastotal1round > 3.2 ){
            if(dastotal1round < 5.1 ){
            temPatient.getRheumatoidArthritisData().setConfirmDAS(das3);
            }
        }
        if(dastotal1round > 5.1 ){
           temPatient.getRheumatoidArthritisData().setConfirmDAS(das4);
        }
        
        
        double crp = temPatient.getRheumatoidArthritisData().getCrpSDAICDAI();
        double temp = 0;

        if (temPatient.getRheumatoidArthritisData().getUnitofCRP() != null) {
            switch (temPatient.getRheumatoidArthritisData().getUnitofCRP()) {
                case mgPerL:
                    temp = crp / 10;
                    break;
                case mgPerDl:
                    temp = crp;
                    break;
            }
        }

        double sdai = temp + 1.0 * (t + s + ega + pga);
        double cdai = 1.0 * (t + s + ega + pga);
        System.out.println("sdai = " + sdai);
        temPatient.getRheumatoidArthritisData().setSdaiRemissionSDAICDAI(sdai);

        temPatient.getRheumatoidArthritisData().setCdaiRemissionSDAICDAI(cdai);
        
        if (sdai <= 3.3){
        temPatient.getRheumatoidArthritisData().setSdaireference(scReference1);
        }
        if (sdai > 3.3){
            if(sdai < 11)
        temPatient.getRheumatoidArthritisData().setSdaireference(scReference2);
        }
        if (sdai>11){
            if(sdai < 26)
        temPatient.getRheumatoidArthritisData().setSdaireference(scReference3);
        }
        if (sdai > 26){
        temPatient.getRheumatoidArthritisData().setSdaireference(scReference4);
        }
        
        if (cdai<=2.8 ){
        temPatient.getRheumatoidArthritisData().setCdaireference(scReference1);
        }
        if (cdai > 2.8){
            if(cdai < 10)
        temPatient.getRheumatoidArthritisData().setCdaireference(scReference2);
        }
        if (cdai>10){
            if(sdai < 22)
        temPatient.getRheumatoidArthritisData().setCdaireference(scReference3);
        }
        if (cdai > 22){
        temPatient.getRheumatoidArthritisData().setCdaireference(scReference4);
        }
        
    }
}
