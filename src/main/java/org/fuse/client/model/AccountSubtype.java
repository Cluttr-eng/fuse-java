/*
 * Fuse
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.fuse.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The account&#39;s subtype
 */
@JsonAdapter(AccountSubtype.Adapter.class)
public enum AccountSubtype {
  
  CHECKING("checking"),
  
  SAVINGS("savings"),
  
  CHECKING_OR_SAVINGS("checking_or_savings"),
  
  BUSINESS_CHECKING_OR_SAVINGS("business_checking_or_savings"),
  
  BUSINESS_SAVINGS("business_savings"),
  
  MONEY_MARKET("money_market"),
  
  CERTIFICATE_OF_DEPOSIT("certificate_of_deposit"),
  
  TREASURY("treasury"),
  
  CREDIT_CARD("credit_card"),
  
  DEBIT_CARD("debit_card"),
  
  BONDS("bonds"),
  
  HSA("hsa"),
  
  PAYPAL("paypal"),
  
  PREPAID("prepaid"),
  
  CASH_MANAGEMENT("cash_management"),
  
  EBT("ebt"),
  
  AUTO("auto"),
  
  BUSINESS("business"),
  
  COMMERCIAL("commercial"),
  
  CONSTRUCTION("construction"),
  
  CONSUMER("consumer"),
  
  HOME_EQUITY("home_equity"),
  
  FOREIGN("foreign"),
  
  LOAN("loan"),
  
  MORTGAGE("mortgage"),
  
  OVERDRAFT("overdraft"),
  
  LINE_OF_CREDIT("line_of_credit"),
  
  STUDENT("student"),
  
  _529("529"),
  
  _401_A("401_a"),
  
  _401_K("401_k"),
  
  _403_B("403_b"),
  
  _457_B("457_b"),
  
  FUNDS("funds"),
  
  BROKERAGE("brokerage"),
  
  SECURITIES("securities"),
  
  STOCKS("stocks"),
  
  CASH_ISA("cash_isa"),
  
  CRYPTO_EXCHANGE("crypto_exchange"),
  
  EDUCATION_SAVING_ACCOUNT("education_saving_account"),
  
  FIXED_ANNUITY("fixed_annuity"),
  
  GIC("gic"),
  
  HEALTH_REIMBURSEMENT_ARRANGEMENT("health_reimbursement_arrangement"),
  
  IRA("ira"),
  
  ISA("isa"),
  
  KEOGH("keogh"),
  
  LIF("lif"),
  
  LIFE_INSURANCE("life_insurance"),
  
  LIRA("lira"),
  
  LRIF("lrif"),
  
  LRSP("lrsp"),
  
  MUTUAL_FUND("mutual_fund"),
  
  NON_CUSTODIAL_WALLET("non_custodial_wallet"),
  
  NON_TAXABLE_BROKERAGE_ACCOUNT("non_taxable_brokerage_account"),
  
  OTHER_ANNUITY("other_annuity"),
  
  OTHER_INSURANCE("other_insurance"),
  
  PENSION("pension"),
  
  PRIF("prif"),
  
  PROFIT_SHARING_PLAN("profit_sharing_plan"),
  
  QSHR("qshr"),
  
  RDSP("rdsp"),
  
  RESP("resp"),
  
  RETIREMENT("retirement"),
  
  RLIF("rlif"),
  
  ROTH_IRA("roth_ira"),
  
  ROTH_401_K("roth_401_k"),
  
  RRIF("rrif"),
  
  RRSP("rrsp"),
  
  SARSEP("sarsep"),
  
  SEP_IRA("sep_ira"),
  
  SIMPLE_IRA("simple_ira"),
  
  SIPP("sipp"),
  
  STOCK_PLAN("stock_plan"),
  
  TFSA("tfsa"),
  
  TRUST("trust"),
  
  UGMA("ugma"),
  
  UTMA("utma"),
  
  VARIABLE_ANNUITY("variable_annuity"),
  
  SMALL_BUSINESS("small_business"),
  
  PERSONAL("personal"),
  
  PERSONAL_WITH_COLLATERAL("personal_with_collateral"),
  
  _457("457"),
  
  ROLLOVER_IRA("rollover_ira"),
  
  TAXABLE("taxable"),
  
  NON_TAXABLE("non_taxable"),
  
  EMPLOYEE_STOCK_OWNERSHIP_PLAN("employee_stock_ownership_plan"),
  
  INDIVIDUAL("individual"),
  
  CASH_MANAGEMENT_ACCOUNT("cash_management_account"),
  
  EMPLOYEE_STOCK_PURCHASE_PLAN("employee_stock_purchase_plan"),
  
  REGISTERED_EDUCATION_SAVINGS_PLAN("registered_education_savings_plan"),
  
  FIXED_ANNUITY_TRADITIONAL_IRA("fixed_annuity_traditional_ira"),
  
  INHERITED_TRADITIONAL_IRA("inherited_traditional_ira"),
  
  FIXED_ANNUITY_ROTH_IRA("fixed_annuity_roth_ira"),
  
  VARIABLE_ANNUITY_ROTH_IRA("variable_annuity_roth_ira"),
  
  INHERITED_ROTH_IRA("inherited_roth_ira"),
  
  ADVISORY_ACCOUNT("advisory_account"),
  
  BROKERAGE_MARGIN("brokerage_margin"),
  
  CHARITABLE_GIFT_ACCOUNT("charitable_gift_account"),
  
  CHURCH_ACCOUNT("church_account"),
  
  CONSERVATORSHIP("conservatorship"),
  
  CUSTODIAL("custodial"),
  
  DEFINED_BENEFIT_PLAN("defined_benefit_plan"),
  
  DEFINED_CONTRIBUTION_PLAN("defined_contribution_plan"),
  
  EDUCATIONAL("educational"),
  
  ESTATE("estate"),
  
  EXECUTOR("executor"),
  
  GROUP_RETIREMENT_SAVINGS_PLAN("group_retirement_savings_plan"),
  
  GUARANTEED_INVESTMENT_CERTIFICATE("guaranteed_investment_certificate"),
  
  INDEXED_ANNUITY("indexed_annuity"),
  
  INVESTMENT_CLUB("investment_club"),
  
  IRREVOCABLE_TRUST("irrevocable_trust"),
  
  JOINT_TENANTS_BY_ENTIRETY("joint_tenants_by_entirety"),
  
  JOINT_TENANTS_COMMUNITY_PROPERTY("joint_tenants_community_property"),
  
  JOINT_TENANTS_IN_COMMON("joint_tenants_in_common"),
  
  JOINT_TENANTS_WITH_RIGHTS_OF_SURVIVORSHIP("joint_tenants_with_rights_of_survivorship"),
  
  KEOUGH_PLAN("keough_plan"),
  
  LIVING_TRUST("living_trust"),
  
  LOCKED_IN_RETIREMENT_ACCOUNT("locked_in_retirement_account"),
  
  LOCKED_IN_RETIREMENT_INVESTMENT_FUND("locked_in_retirement_investment_fund"),
  
  LOCKED_IN_RETIREMENT_SAVINGS_ACCOUNT("locked_in_retirement_savings_account"),
  
  MONEY_PURCHASE_PLAN("money_purchase_plan"),
  
  PARTNERSHIP("partnership"),
  
  _409_A("409_a"),
  
  RPP("rpp"),
  
  REVOCABLE_TRUST("revocable_trust"),
  
  ROTH_CONVERSION("roth_conversion"),
  
  SOLE_PROPRIETORSHIP("sole_proprietorship"),
  
  SPOUSAL_IRA("spousal_ira"),
  
  SPOUSAL_ROTH_IRA("spousal_roth_ira"),
  
  TESTAMENTARY_TRUST("testamentary_trust"),
  
  THRIFT_SAVINGS_PLAN("thrift_savings_plan"),
  
  INHERITED_ANNUITY("inherited_annuity"),
  
  CORPORATE_ACCOUNT("corporate_account"),
  
  LIMITED_LIABILITY_ACCOUNT("limited_liability_account"),
  
  BOAT("boat"),
  
  POWERSPORTS("powersports"),
  
  RV("rv"),
  
  HELOC("heloc"),
  
  VEHICLE_INSURANCE("vehicle_insurance"),
  
  DISABILITY("disability"),
  
  HEALTH("health"),
  
  LONG_TERM_CARE("long_term_care"),
  
  PROPERTY_AND_CASUALTY("property_and_casualty"),
  
  UNIVERSAL_LIFE("universal_life"),
  
  TERM_LIFE("term_life"),
  
  WHOLE_LIFE("whole_life"),
  
  ACCIDENTAL_DEATH_AND_DISMEMBERMENT("accidental_death_and_dismemberment"),
  
  VARIABLE_UNIVERSAL_LIFE("variable_universal_life"),
  
  REVOLVING("revolving"),
  
  OTHER("other"),
  
  TIME_DEPOSIT("time_deposit"),
  
  ROTH("roth"),
  
  MILITARY("military"),
  
  INSTALLMENT("installment"),
  
  INSTITUTIONAL_TRUST("institutional_trust"),
  
  HOME_LINE_OF_CREDIT("home_line_of_credit"),
  
  GUARDIAN("guardian"),
  
  COMMERCIAL_LINE_OF_CREDIT("commercial_line_of_credit"),
  
  CHARGE("charge"),
  
  COVERDELL("coverdell"),
  
  ESCROW("escrow"),
  
  MINUS("-");

  private String value;

  AccountSubtype(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountSubtype fromValue(String value) {
    for (AccountSubtype b : AccountSubtype.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AccountSubtype> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountSubtype enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountSubtype read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountSubtype.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    AccountSubtype.fromValue(value);
  }
}

