/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.nrd.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lk.gov.health.nrd.enums.LupusNephritis;

/**
 *
 * @author User
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class SystemicLupusErythematosusData extends Encounter {

    
    
    private boolean clinicalCriteria1;
    private boolean clinicalCriteria2;
    private boolean clinicalCriteria3;
   private boolean clinicalCriteria4;
    private boolean clinicalCriteria5;
    private boolean clinicalCriteria6;
    private boolean clinicalCriteria7;
    private boolean clinicalCriteria8;
    private boolean clinicalCriteria9;
    private boolean clinicalCriteria10;
    private boolean clinicalCriteria11;
    private boolean immunologicCriteria1;     
    private boolean immunologicCriteria2;
    private boolean immunologicCriteria3;
    private boolean immunologicCriteria4;
    private boolean immunologicCriteria5;
    private boolean immunologicCriteria6;
    private int criteriaTotal;
    private int clinicalCriteriaTotal;
    private int immunologicCriteriaTotal;
    private String diognosisConfirm;
    private boolean complicationRespiratory;
    private String otherComplication;
    private boolean checklistSLEactivityORflares;
    private boolean checklistLupusNephritis;
    private boolean checklistSerologicalActivity;
    private boolean checklistPreviousAdversePregnancyOutcomes;
    private boolean checklistHistoryOfVascularThrombosis;
    private boolean checklistAutoAntibodyProfile;
    private boolean sledaiSeizure8;
    private boolean sledaiPsychosis8;
    private boolean sledaiOrganicBrainSyndrome8;
    private boolean sledaiVisualDisturbances8;
    private boolean sledaiCranialNerveDisorder8;
    private boolean sledaiLupusHeadache8;
    private boolean sledaiCva8;
    private boolean sledaiVasculitis8;
    private boolean sledaiArthritis4;
    private boolean sledaiMyositis4;
    private boolean sledaiUrinaryCasts4;
    private boolean sledaiHematuria4;
    private boolean sledaiProteinuria4;
    private boolean sledaiPyuria4;
    private boolean sledaiNewRash2;
    private boolean sledaiAlopecia2;
    private boolean sledaiMucosalUlcers2;
    private boolean sledaiPleurisy2; 
    private boolean sledaiPericarditis2;
    private boolean sledaiLowComplement2;
    private boolean sledaiIncreasedDNABinding2;
    private boolean sledaiFever1;
    private boolean sledaiThrombocytopenia1;
    private boolean sledaiLeukopenia1;
    private int sledaiTotal;
    private String sledaiFlare;
    @Enumerated(EnumType.STRING)
    private LupusNephritis LupusNephritis;

    public boolean isClinicalCriteria1() {
        return clinicalCriteria1;
    }

    public void setClinicalCriteria1(boolean clinicalCriteria1) {
        this.clinicalCriteria1 = clinicalCriteria1;
    }

    public boolean isClinicalCriteria2() {
        return clinicalCriteria2;
    }

    public void setClinicalCriteria2(boolean clinicalCriteria2) {
        this.clinicalCriteria2 = clinicalCriteria2;
    }

    public boolean isClinicalCriteria3() {
        return clinicalCriteria3;
    }

    public void setClinicalCriteria3(boolean clinicalCriteria3) {
        this.clinicalCriteria3 = clinicalCriteria3;
    }

    public boolean isClinicalCriteria4() {
        return clinicalCriteria4;
    }

    public void setClinicalCriteria4(boolean clinicalCriteria4) {
        this.clinicalCriteria4 = clinicalCriteria4;
    }

    public boolean isClinicalCriteria5() {
        return clinicalCriteria5;
    }

    public void setClinicalCriteria5(boolean clinicalCriteria5) {
        this.clinicalCriteria5 = clinicalCriteria5;
    }

    public boolean isClinicalCriteria6() {
        return clinicalCriteria6;
    }

    public void setClinicalCriteria6(boolean clinicalCriteria6) {
        this.clinicalCriteria6 = clinicalCriteria6;
    }

    public boolean isClinicalCriteria7() {
        return clinicalCriteria7;
    }

    public void setClinicalCriteria7(boolean clinicalCriteria7) {
        this.clinicalCriteria7 = clinicalCriteria7;
    }

    public boolean isClinicalCriteria8() {
        return clinicalCriteria8;
    }

    public void setClinicalCriteria8(boolean clinicalCriteria8) {
        this.clinicalCriteria8 = clinicalCriteria8;
    }

    public boolean isClinicalCriteria9() {
        return clinicalCriteria9;
    }

    public void setClinicalCriteria9(boolean clinicalCriteria9) {
        this.clinicalCriteria9 = clinicalCriteria9;
    }

    public boolean isClinicalCriteria10() {
        return clinicalCriteria10;
    }

    public void setClinicalCriteria10(boolean clinicalCriteria10) {
        this.clinicalCriteria10 = clinicalCriteria10;
    }

    public boolean isClinicalCriteria11() {
        return clinicalCriteria11;
    }

    public void setClinicalCriteria11(boolean clinicalCriteria11) {
        this.clinicalCriteria11 = clinicalCriteria11;
    }

    public boolean isImmunologicCriteria1() {
        return immunologicCriteria1;
    }

    public void setImmunologicCriteria1(boolean immunologicCriteria1) {
        this.immunologicCriteria1 = immunologicCriteria1;
    }

    public boolean isImmunologicCriteria2() {
        return immunologicCriteria2;
    }

    public void setImmunologicCriteria2(boolean immunologicCriteria2) {
        this.immunologicCriteria2 = immunologicCriteria2;
    }

    public boolean isImmunologicCriteria3() {
        return immunologicCriteria3;
    }

    public void setImmunologicCriteria3(boolean immunologicCriteria3) {
        this.immunologicCriteria3 = immunologicCriteria3;
    }

    public boolean isImmunologicCriteria4() {
        return immunologicCriteria4;
    }

    public void setImmunologicCriteria4(boolean immunologicCriteria4) {
        this.immunologicCriteria4 = immunologicCriteria4;
    }

    public boolean isImmunologicCriteria5() {
        return immunologicCriteria5;
    }

    public void setImmunologicCriteria5(boolean immunologicCriteria5) {
        this.immunologicCriteria5 = immunologicCriteria5;
    }

    public boolean isImmunologicCriteria6() {
        return immunologicCriteria6;
    }

    public void setImmunologicCriteria6(boolean immunologicCriteria6) {
        this.immunologicCriteria6 = immunologicCriteria6;
    }

    public int getCriteriaTotal() {
        return criteriaTotal;
    }

    public void setCriteriaTotal(int criteriaTotal) {
        this.criteriaTotal = criteriaTotal;
    }

    public int getClinicalCriteriaTotal() {
        return clinicalCriteriaTotal;
    }

    public void setClinicalCriteriaTotal(int clinicalCriteriaTotal) {
        this.clinicalCriteriaTotal = clinicalCriteriaTotal;
    }

    public int getImmunologicCriteriaTotal() {
        return immunologicCriteriaTotal;
    }

    public void setImmunologicCriteriaTotal(int immunologicCriteriaTotal) {
        this.immunologicCriteriaTotal = immunologicCriteriaTotal;
    }

    public String getDiognosisConfirm() {
        return diognosisConfirm;
    }

    public void setDiognosisConfirm(String diognosisConfirm) {
        this.diognosisConfirm = diognosisConfirm;
    }

    public boolean isComplicationRespiratory() {
        return complicationRespiratory;
    }

    public void setComplicationRespiratory(boolean complicationRespiratory) {
        this.complicationRespiratory = complicationRespiratory;
    }

   
    public String getOtherComplication() {
        return otherComplication;
    }

    public void setOtherComplication(String otherComplication) {
        this.otherComplication = otherComplication;
    }

    
    
    public boolean isChecklistSLEactivityORflares() {
        return checklistSLEactivityORflares;
    }

    public void setChecklistSLEactivityORflares(boolean checklistSLEactivityORflares) {
        this.checklistSLEactivityORflares = checklistSLEactivityORflares;
    }

    public boolean isChecklistLupusNephritis() {
        return checklistLupusNephritis;
    }

    public void setChecklistLupusNephritis(boolean checklistLupusNephritis) {
        this.checklistLupusNephritis = checklistLupusNephritis;
    }

    public boolean isChecklistSerologicalActivity() {
        return checklistSerologicalActivity;
    }

    public void setChecklistSerologicalActivity(boolean checklistSerologicalActivity) {
        this.checklistSerologicalActivity = checklistSerologicalActivity;
    }

    public boolean isChecklistPreviousAdversePregnancyOutcomes() {
        return checklistPreviousAdversePregnancyOutcomes;
    }

    public void setChecklistPreviousAdversePregnancyOutcomes(boolean checklistPreviousAdversePregnancyOutcomes) {
        this.checklistPreviousAdversePregnancyOutcomes = checklistPreviousAdversePregnancyOutcomes;
    }

    public boolean isChecklistHistoryOfVascularThrombosis() {
        return checklistHistoryOfVascularThrombosis;
    }

    public void setChecklistHistoryOfVascularThrombosis(boolean checklistHistoryOfVascularThrombosis) {
        this.checklistHistoryOfVascularThrombosis = checklistHistoryOfVascularThrombosis;
    }

    public boolean isChecklistAutoAntibodyProfile() {
        return checklistAutoAntibodyProfile;
    }

    public void setChecklistAutoAntibodyProfile(boolean checklistAutoAntibodyProfile) {
        this.checklistAutoAntibodyProfile = checklistAutoAntibodyProfile;
    }

    public boolean isSledaiSeizure8() {
        return sledaiSeizure8;
    }

    public void setSledaiSeizure8(boolean sledaiSeizure8) {
        this.sledaiSeizure8 = sledaiSeizure8;
    }

    public boolean isSledaiPsychosis8() {
        return sledaiPsychosis8;
    }

    public void setSledaiPsychosis8(boolean sledaiPsychosis8) {
        this.sledaiPsychosis8 = sledaiPsychosis8;
    }

    public boolean isSledaiOrganicBrainSyndrome8() {
        return sledaiOrganicBrainSyndrome8;
    }

    public void setSledaiOrganicBrainSyndrome8(boolean sledaiOrganicBrainSyndrome8) {
        this.sledaiOrganicBrainSyndrome8 = sledaiOrganicBrainSyndrome8;
    }

    public boolean isSledaiVisualDisturbances8() {
        return sledaiVisualDisturbances8;
    }

    public void setSledaiVisualDisturbances8(boolean sledaiVisualDisturbances8) {
        this.sledaiVisualDisturbances8 = sledaiVisualDisturbances8;
    }

    public boolean isSledaiCranialNerveDisorder8() {
        return sledaiCranialNerveDisorder8;
    }

    public void setSledaiCranialNerveDisorder8(boolean sledaiCranialNerveDisorder8) {
        this.sledaiCranialNerveDisorder8 = sledaiCranialNerveDisorder8;
    }

    public boolean isSledaiLupusHeadache8() {
        return sledaiLupusHeadache8;
    }

    public void setSledaiLupusHeadache8(boolean sledaiLupusHeadache8) {
        this.sledaiLupusHeadache8 = sledaiLupusHeadache8;
    }

    public boolean isSledaiCva8() {
        return sledaiCva8;
    }

    public void setSledaiCva8(boolean sledaiCva8) {
        this.sledaiCva8 = sledaiCva8;
    }

    public boolean isSledaiVasculitis8() {
        return sledaiVasculitis8;
    }

    public void setSledaiVasculitis8(boolean sledaiVasculitis8) {
        this.sledaiVasculitis8 = sledaiVasculitis8;
    }

    public boolean isSledaiArthritis4() {
        return sledaiArthritis4;
    }

    public void setSledaiArthritis4(boolean sledaiArthritis4) {
        this.sledaiArthritis4 = sledaiArthritis4;
    }

    public boolean isSledaiMyositis4() {
        return sledaiMyositis4;
    }

    public void setSledaiMyositis4(boolean sledaiMyositis4) {
        this.sledaiMyositis4 = sledaiMyositis4;
    }

    public boolean isSledaiUrinaryCasts4() {
        return sledaiUrinaryCasts4;
    }

    public void setSledaiUrinaryCasts4(boolean sledaiUrinaryCasts4) {
        this.sledaiUrinaryCasts4 = sledaiUrinaryCasts4;
    }

    public boolean isSledaiHematuria4() {
        return sledaiHematuria4;
    }

    public void setSledaiHematuria4(boolean sledaiHematuria4) {
        this.sledaiHematuria4 = sledaiHematuria4;
    }

    public boolean isSledaiProteinuria4() {
        return sledaiProteinuria4;
    }

    public void setSledaiProteinuria4(boolean sledaiProteinuria4) {
        this.sledaiProteinuria4 = sledaiProteinuria4;
    }

    public boolean isSledaiPyuria4() {
        return sledaiPyuria4;
    }

    public void setSledaiPyuria4(boolean sledaiPyuria4) {
        this.sledaiPyuria4 = sledaiPyuria4;
    }

    public boolean isSledaiNewRash2() {
        return sledaiNewRash2;
    }

    public void setSledaiNewRash2(boolean sledaiNewRash2) {
        this.sledaiNewRash2 = sledaiNewRash2;
    }

    public boolean isSledaiAlopecia2() {
        return sledaiAlopecia2;
    }

    public void setSledaiAlopecia2(boolean sledaiAlopecia2) {
        this.sledaiAlopecia2 = sledaiAlopecia2;
    }

    public boolean isSledaiMucosalUlcers2() {
        return sledaiMucosalUlcers2;
    }

    public void setSledaiMucosalUlcers2(boolean sledaiMucosalUlcers2) {
        this.sledaiMucosalUlcers2 = sledaiMucosalUlcers2;
    }

    public boolean isSledaiPleurisy2() {
        return sledaiPleurisy2;
    }

    public void setSledaiPleurisy2(boolean sledaiPleurisy2) {
        this.sledaiPleurisy2 = sledaiPleurisy2;
    }

    public boolean isSledaiPericarditis2() {
        return sledaiPericarditis2;
    }

    public void setSledaiPericarditis2(boolean sledaiPericarditis2) {
        this.sledaiPericarditis2 = sledaiPericarditis2;
    }

    public boolean isSledaiLowComplement2() {
        return sledaiLowComplement2;
    }

    public void setSledaiLowComplement2(boolean sledaiLowComplement2) {
        this.sledaiLowComplement2 = sledaiLowComplement2;
    }

    public boolean isSledaiIncreasedDNABinding2() {
        return sledaiIncreasedDNABinding2;
    }

    public void setSledaiIncreasedDNABinding2(boolean sledaiIncreasedDNABinding2) {
        this.sledaiIncreasedDNABinding2 = sledaiIncreasedDNABinding2;
    }

    public boolean isSledaiFever1() {
        return sledaiFever1;
    }

    public void setSledaiFever1(boolean sledaiFever1) {
        this.sledaiFever1 = sledaiFever1;
    }

    public boolean isSledaiThrombocytopenia1() {
        return sledaiThrombocytopenia1;
    }

    public void setSledaiThrombocytopenia1(boolean sledaiThrombocytopenia1) {
        this.sledaiThrombocytopenia1 = sledaiThrombocytopenia1;
    }

    public boolean isSledaiLeukopenia1() {
        return sledaiLeukopenia1;
    }

    public void setSledaiLeukopenia1(boolean sledaiLeukopenia1) {
        this.sledaiLeukopenia1 = sledaiLeukopenia1;
    }

    public int getSledaiTotal() {
        return sledaiTotal;
    }

    public void setSledaiTotal(int sledaiTotal) {
        this.sledaiTotal = sledaiTotal;
    }

    public String getSledaiFlare() {
        return sledaiFlare;
    }

    public void setSledaiFlare(String sledaiFlare) {
        this.sledaiFlare = sledaiFlare;
    }

    public LupusNephritis getLupusNephritis() {
        return LupusNephritis;
    }

    public void setLupusNephritis(LupusNephritis LupusNephritis) {
        this.LupusNephritis = LupusNephritis;
    }

    

    
}
