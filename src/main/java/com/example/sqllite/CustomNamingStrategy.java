//package com.example.sqllite;
//
//import org.hibernate.boot.model.naming.Identifier;
//import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
//import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
//
//
//public class CustomNamingStrategy extends PhysicalNamingStrategyStandardImpl {
//
//    /**
//     * TODO Make this an injectable application property
//     */
////    public static final String TABLE_NAME_PREFIX = "MY_PREFIX_";
//
//    @Override
//    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
////        Identifier newIdentifier = new Identifier(TABLE_NAME_PREFIX + name.getText(), name.isQuoted());
//        Identifier newIdentifier = new Identifier(name.getText(), true);
//        return super.toPhysicalTableName(newIdentifier, context);
//    }
//}
////public class CustomNamingStrategy extends ImprovedNamingStrategy {
////
////    private static final long serialVersionUID = 1L;
////    private static final String PREFIX = "PFX_";
////
////    @Override
////    public String classToTableName(final String className) {
////        return this.addPrefix(super.classToTableName(className));
////    }
////
////    @Override
////    public String collectionTableName(final String ownerEntity,
////                                      final String ownerEntityTable, final String associatedEntity,
////                                      final String associatedEntityTable, final String propertyName) {
////        return this.addPrefix(super.collectionTableName(ownerEntity,
////                ownerEntityTable, associatedEntity, associatedEntityTable,
////                propertyName));
////    }
////
////    @Override
////    public String logicalCollectionTableName(final String tableName,
////                                             final String ownerEntityTable, final String associatedEntityTable,
////                                             final String propertyName) {
////        return this.addPrefix(super.logicalCollectionTableName(tableName,
////                ownerEntityTable, associatedEntityTable, propertyName));
////    }
////
////    private String addPrefix(final String composedTableName) {
////
////        return PREFIX
////                + composedTableName.toUpperCase().replace("_", "");
////
////    }
////
////}
